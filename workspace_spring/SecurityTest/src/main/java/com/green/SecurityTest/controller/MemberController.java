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
    //의존성 주입 방식 : 생성자 주입(적극 권장), setter 주입, 필드 주입
    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    //로그인 페이지로 이동
    @GetMapping("/loginForm")
    public String loginForm(){
        String name = "java";

        //name 변수의 값을 암호화
        String encodedName = passwordEncoder.encode(name);
        System.out.println(encodedName);

        String encodedName1 = passwordEncoder.encode(name);
        System.out.println(encodedName1);

        //첫번째 매개변수 : 암호화되지 않은 데이터
        //두번째 매개변수 : 암호화된 데이터
        boolean result1 = passwordEncoder.matches("java", encodedName);
        boolean result2 = passwordEncoder.matches("java", encodedName1);
        boolean result3 = passwordEncoder.matches("java1", encodedName);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        return "로그인 페이지로 이동";
    }

    //회원가입 페이지로 이동
    @GetMapping("/joinForm")
    public String joinForm(){
        return "회원가입 페이지로 이동";
    }

    //회원가입
    @PostMapping("/join")
    public String join(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);

        //비밀번호 암호화
        String encodedPw = passwordEncoder.encode(memberVO.getMemPw());
        memberVO.setMemPw(encodedPw);

        //기본 권한
        memberVO.setMemRole("USER");

        memberService.join(memberVO);

        return "회원가입 성공";
    }
}









