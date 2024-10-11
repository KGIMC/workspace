package com.green.SecurityTest.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
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

    // JwtUtil 의존성 주입
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

        //우리가 입력한 아아디, 비번 가져오기(임시)
        String username = obtainUsername(request);
        String password = obtainPassword(request);

        log.info("우리가 입력받은 아이디 : " + username);
        log.info("우리가 입력받은 비번 : {}", password);

        //아래의 클래스는 아이디와 비번번호를 AuthenticationManager 클래스에
        //아이디와 비번을 전달하는 보안이 좋은 통.
        //이 통에 아이디와 비번을 담아서 AuthenticationManager에 전달.
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password, null);

        return authenticationManager.authenticate(authToken);
    }

    //로그인 성공 시 실행되는 메서드
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        log.info("로그인 성공");

        // 매개변수로 전달되는 Authentication authResult 이 객체에 로그인 성공한 회원 정보 다 있음
        // 토큰 생성을 위한 로그인한 회원의 id, 권한정보 가져오기
        // 로그인한 회원의 id
        String userId = authResult.getName();


        // 로그인한 회원의 권한
        Collection<? extends GrantedAuthority> authorities = authResult.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        GrantedAuthority auth = iterator.next();
        String role = auth.getAuthority();

        // jwt 토큰 생성
        String token = jwtUtil.createJwt(userId, role);

        // 생성한 token을 client의 헤더에 담아서 응답
        // 응답헤더에는 key : value의 형태로 데이터를 추가
        // "Authorization" : "Bearer 토큰"
        response.setHeader("Authorization", "Bearer " + token);
        response.setStatus(HttpStatus.OK.value());
        // BAD_REQUEST - 400
        // OK - 200
    }

    //로그인 실패 시 실행되는 메서드
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        log.info("로그인 실패");
        response.setStatus(401); // 인증 실패 코드
    }


}






