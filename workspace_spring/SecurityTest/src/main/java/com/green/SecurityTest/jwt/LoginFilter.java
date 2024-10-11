package com.green.SecurityTest.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.SecurityTest.vo.MemberVO;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;

/*
시큐리티를 사용한 로그인은 먼저 UsernamePasswordAuthenticationFilter 클래스로부터 시작한다.
UsernamePasswordAuthenticationFilter는 로그인을 시도하면 로그인시 입력한
아이디와 비밀번호가 가져오는 역할.

UsernamePasswordAuthenticationFilter는 로그인 요청에 대해서는 동작 함.
아무것도 설정하지 않으면 "/login" 요청을 로그인 하는 요청으로 인지함.
로그인 요청의 변경은 생성자에서 진행.

우리가 상속받은 filter는 Form 방식의 로그인에서는 자동으로 실행되지만
jwt를 사용한 로그인에서는 UsernamePasswordAuthenticationFilter가 실행되지 않는다.
따라서, SecurityConfig 클래스에 우리가 만든 LoginFilter 클래스가 실행될수 있도록 설정해야 함.
 */
@Slf4j
public class LoginFilter extends UsernamePasswordAuthenticationFilter {
    //실제 로그인 검증을 실행하는 객체
    private final AuthenticationManager authenticationManager;

    //JwtUtil 의존성 주입
    private final JwtUtil jwtUtil;

    public LoginFilter(AuthenticationManager authenticationManager, JwtUtil jwtUtil){
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;

        //로그인 요청 url을 변경
        setFilterProcessesUrl("/member/login");

        //아이디 , 비번 전달되는 name변경
        setUsernameParameter("memId");
        setPasswordParameter("memPw");
    }

    /*
    로그인 요청 시 최초로 실행되는 메서드
    해당 메서드에서는 로그인 요청 시 전달되는 아이디, 비번을 받아
    AuthenticationManager에 전달.

    AuthenticationManager가 실제로 로그인 로직을 싱행하는 객체.

    프론트에서 입력받은 아이디와 비밀번호는 특별한 설정을 하지않으면
    username, password라는 이름으로 값을 전달받게 설정되어 있음.
    전달되는 아이디와 비번의 이름 변경은 생성자에서 진행.
    */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        log.info("LoginFilter 클래스의 attemptAuthentication() 실행~");

        //우리가 입력한 아아디, 비번 가져오기
        //리액트에서 전달되는 데이터는 json 타입으로 자바로 가져옴
        //json 타입 : 자바스크립트의 객체를 문자열화 시킨 것.

        //1. json타입의 데이터를 자바의 클래스형태로 변환시켜줄 객체 생성
        ObjectMapper objectMapper = new ObjectMapper();

        MemberVO vo = null;
        try{
            //2. 리액트에서 넘어오는 json 데이터 받기
            ServletInputStream inputStream = request.getInputStream();
            String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

            //3. json 데이터를 MemberVO 형태로 변환   "{"memId" : "admin" , "memPw":"1111"}"
            vo = objectMapper.readValue(messageBody, MemberVO.class);
        }catch (IOException e){
            System.out.println("attemptAuthentication() 메서드에서 json으로 넘어오는 로그인 정보 받기 실패");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("json타입으로 넘어온 로그인 정보를 MemberVO 객체로 변환 중 예외 발생");
            e.printStackTrace();
        }

        log.info("우리가 입력받은 아이디 : " + vo.getMemId());
        log.info("우리가 입력받은 비번 : {}", vo.getMemPw());

        //아래의 클래스는 아이디와 비번번호를 AuthenticationManager 클래스에
        //아이디와 비번을 전달하는 보안이 좋은 통.
        //이 통에 아이디와 비번을 담아서 AuthenticationManager에 전달.
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(vo.getMemId(), vo.getMemPw(), null);

        return authenticationManager.authenticate(authToken);
    }

    //로그인 성공 시 실행되는 메서드
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        log.info("로그인 성공");

        //매개변수로 전달되는 Authentication authResult 이 객체에 로그인 성공한 회원 정보 다 있음
        //토큰 생성을 위한 로그인한 회원의 id, 권한 정보
        //로그인한 회원 id
        String userId = authResult.getName();

        //로그인한 회원의 권한들
        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        GrantedAuthority auth = iterator.next();
        String role = auth.getAuthority();

        //jwt 토큰 생성
        String token = jwtUtil.createJwt(userId, role);

        //생성한 토큰을 client의 헤더에 담아서 응답
        //응답헤더에는 key : value 의 형태로 데이터를 추가
        //Bearer : 뒤에 오는 문자열이 jwt 토큰 형태임을 알려줌
        //"Authorization" : "Bearer 토큰"
        response.setHeader("Authorization", "Bearer " + token);
        response.setStatus(HttpStatus.OK.value()); //200

    }

    //로그인 실패 시 실행되는 메서드
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        log.info("로그인 실패");
        response.setStatus(401); //인증 실패
    }
}






