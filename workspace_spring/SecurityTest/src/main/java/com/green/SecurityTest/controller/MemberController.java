package com.green.SecurityTest.controller;

import com.green.SecurityTest.service.MemberService;
import com.green.SecurityTest.service.MemberServiceImpl;
import com.green.SecurityTest.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    // 인증 받지 않은 사람도 접근할 수 있는 요청
    @GetMapping("/test1")
    public String test1(){
        return "test1 실행";
    }

    // 인증 받은 사람만 접근할 수 있는 요청
    @GetMapping("/test2")
    public String test2(){
        return "test2 실행";
    }

    // 인증 + 일반회원만 접근 가능
    @GetMapping("/test3")
    public String test3(){
        return "test3 실행";
    }

    // 인증 + 관리자 권한이 있는 사람만 접근 가능
    @GetMapping("/test4")
    public String test4(){
        return "test4 실행";
    }

    // 인증 + 매니저 or 관리자
    @GetMapping("/test5")
    public String test5(){
        return "test5 실행";
    }

}









