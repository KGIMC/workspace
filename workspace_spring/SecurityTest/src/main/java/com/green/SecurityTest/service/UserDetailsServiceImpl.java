package com.green.SecurityTest.service;

import com.green.SecurityTest.vo.CustomUserVO;
import com.green.SecurityTest.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//로그인하려는 회원의 정보를 디비에서 조회할때는 마음대로 하는게 아니라
//Security에서 알려주는 방식대로 쿼리 진행
//UserDetailsService인터페이스에 정의된 loadUserByUsername() 메서드 안에서
//로그인 하려는 회원의 정보를 조회해야 함
@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final MemberService memberService;

    //로그인 할때 자동으로 실행되는 메서드
    //매개변수 String username : 로그인 요청 시 화면에 입력한 회원 ID
    @Override
    public UserDetails loadUserByUsername(String username) {
        log.info("UserDetailsServiceImpl 클래스의 loadUserByUsername() 메서드 실행~");

        //로그인 하려는 회원의 정보를 조회
        MemberVO loginInfo = memberService.getMemberForLogin(username);

        //로그인하려는 회원 정보가 없을때
        if(loginInfo == null){
            throw new UsernameNotFoundException("회원 정보 없음");
        }

        //조회한 정보를 CustomUserVO 객체에 담아 줌
        CustomUserVO customUser = new CustomUserVO(loginInfo);

        //실제 로그인을 처리하는 AuthenticationManager에게 로그인 정보를 전달
        return customUser;
    }

}







