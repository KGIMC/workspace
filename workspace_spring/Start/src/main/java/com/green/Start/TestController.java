package com.green.Start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 페이지(html) 이동을 담당하는 클래스 - Controller
@Controller
// @ : 어노테이션(Annotation)
// 해당 역할을 담당한다고 인지시켜주는 역할
// @Controller -> 해당 클래스가 관제탑 역할을 하는 Controller 인것을 인지시켜 줌.
public class TestController {

    // 컨트롤러 내의 리턴타입이 문자열(String)인 메소드는
    // 실행하면 리턴되는 문자열 이름의 html 파일을 실행시켜줌.
    @GetMapping("/t1")
    public String goTest1(){
        System.out.println("goTest1 메소드 실행");
        return "test1";
    }

    @GetMapping("/t2")
    public String goTest2(){
        System.out.println("goTest2 메소드 실행");
        return "test2";
    }

    @GetMapping("/t3")
    public String goTest3(){
        System.out.println("goTest3 메소드 실행");
        return "test3";
    }
}


