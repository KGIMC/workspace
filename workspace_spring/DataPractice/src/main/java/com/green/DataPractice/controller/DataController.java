package com.green.DataPractice.controller;

import com.green.DataPractice.vo.LoginVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 관제탑 역할
public class DataController {

    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }

    // form 태그로 전달되는 데이터를 받을 때 매개변수 사용
    // requestparam = name값 중요 = name값은 항상 맞춰야함.
    // @RequestParam(name = "이름") : "이름" -> 전달되는 input 태그의 name 속성 값


    // RequestParam으로 데이터 받아오기
    @GetMapping("/login")
    public String login(@RequestParam(name = "id") String id, @RequestParam(name = "pw") String pw){
        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        return "login_result";
    }

    // 객체값으로 데이터 받아오기
    // html에서 전달되는 데이터의 이름(input 태그의 name 속성 값)과
    // 매개변수로 전달된 클래스의 멤버변수명이 일치하면
    // html에서 넘어온 데이터를 객체에 자동 저장시켜줌.
    // 이때 클래스에는 반드시 getter와 setter가 생성되어야함.
    // 이렇게 html에서 넘어온 데이터를 받기 위해 컨트롤러 안의 메소드에서
    // 매개변수로 활용하는 객체를 커맨드 객체라고 지칭
    @PostMapping("/login1")
    public String login1(LoginVO loginVO, Model model){
        System.out.println("id = " + loginVO.getId());
        System.out.println("pw = " + loginVO.getPw());

        model.addAttribute("loginInfo", loginVO);
        return "login_result";
    }


}
