package com.green.SecurityTest.controller;


import com.green.SecurityTest.service.MemberService;
import com.green.SecurityTest.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    // 의존성 주입 방식 : 생성자(적극권장), setter, 필드(권장X)

    // final 사용 이유 - 안정성 증가
    // final 선언과 동시에 초기값 줘야함.
    // final - 초기화 되면 값 변경 불가
    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;


    // 로그인 페이지로 이동
    @GetMapping("/loginForm")
    public String loginForm(){

        String name = "java";
        // name 변수의값을 암호화시키기
        String encodedName = passwordEncoder.encode(name);
        System.out.println(encodedName);

        String encodedName1 = passwordEncoder.encode(name);
        System.out.println(encodedName1);

        // 복호화하는 기능 없음 ( decoded )

        // 첫번째 매개변수 : 암호화되지 않은 데이터
        // 두번째 매개변수 : 암호화된 데이터
        boolean result = passwordEncoder.matches("java", encodedName);
        boolean result2 = passwordEncoder.matches("java", encodedName1);
        boolean result3 = passwordEncoder.matches("java1", encodedName);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


        return "로그인 실행";
    }

    // 회원가입 페이지로 이동
    @GetMapping("/joinForm")
    public String joinForm(){
        return "회원가입 실행";
    }

    // 회원가입
    @PostMapping("/join")
    // 리액트 기준으론 @RequestBody, 매개변수
    public String join(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);

        // 비밀번호 암호화 후 insert 실행되게

        String encodedPw = passwordEncoder.encode(memberVO.getMemPw());
        memberVO.setMemPw(encodedPw);

        // 기본 권한
        memberVO.setMemRole("USER");

        memberService.join(memberVO);

        return "회원가입 성공";
    }

}
