package com.green.SecurityTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    // 프론트에서 토큰 가져오는지 확인하는 메서드
    @GetMapping("/getToken")
    public String getTokenTest(){
        return "토큰 받음";
    }

    @GetMapping("/")
    public String main(){
        return "main is running~";
    }

    @GetMapping("/test")
    public String test(){
        return "test is running~";
    }

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






