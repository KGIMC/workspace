package com.green.Start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


// 1. 자바에서 html로 데이터를 전달하기 위해서는
//    실행되는 메소드의 매개변수에 Model 인터페이스 객체를 선언
// 2. 객체명.addAtrribute 메소드를 사용하여 데이터를 전달한다.
@Controller
public class MemberController {
    @GetMapping("/main")
        public String goMain(Model model) {
        System.out.println("goMain 메소드 실행");
        model.addAttribute("name", "java");
        model.addAttribute("age", 10);

        return "main";
    }

    @GetMapping("/test_login")
        public String goLogin(Model model) {
        System.out.println("goLogin 메소드 실행");
        String[] hobbies = {"독서", "운동", "공부"};
        model.addAttribute("abc", hobbies);


        Member m = new Member("홍", 20, 90);
        model.addAttribute("member", m);

        return "test_login";
    }

    @GetMapping("/test_join")
        public String goJoin(Model model){
        List<Member> List = new ArrayList<>();

        Member m1 = new Member("김씨", 20, 90);
        Member m2 = new Member("이씨", 30, 80);
        Member m3 = new Member("박씨", 40, 70);

        List.add(m1);
        List.add(m2);
        List.add(m3);

        model.addAttribute("memberList", List);


        System.out.println("goJoin 메소드 실행");
        return "test_join";
    }

}
