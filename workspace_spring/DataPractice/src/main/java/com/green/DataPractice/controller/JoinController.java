package com.green.DataPractice.controller;

import com.green.DataPractice.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @GetMapping("/reg_member")
    public String reg_member(){
        return "reg_member";
    }


    // 커맨드 객체는 model을 사용하지 않아도 자동으로 html로 전달된다.
    // 이떄 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼 이름으로 넘어간다.
    @PostMapping("/member_info")
    public String member_info(MemberVO memberVO, Model model){
        System.out.println("아이디 : " + memberVO.getId());
        System.out.println("비밀번호 : " + memberVO.getPw());
        System.out.println("이름 : " + memberVO.getName());
        System.out.println("연락처 : " + memberVO.getTel());
        System.out.println("이메일 : " + memberVO.getEmail());
        System.out.println("생일 : " + memberVO.getBirth());


        model.addAttribute("memberInfo", memberVO);
        return "member_info";
    }
}
