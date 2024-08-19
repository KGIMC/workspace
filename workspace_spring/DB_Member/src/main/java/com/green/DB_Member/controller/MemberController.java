package com.green.DB_Member.controller;

import com.green.DB_Member.service.MemberService;
import com.green.DB_Member.service.MemberServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller // 컨트롤러 역할을 함과 동시에 객체 생성
public class MemberController {

    @Resource(name = "memberService")
    private MemberServiceImpl memberService;

    @GetMapping("/")
    public String memberList(){
        return "member_list";
    }

    // 회원 등록 페이지
    @GetMapping("/insertForm")
    public String insertForm(){
            return "reg_member";
    }

    // 회원 등록 + 회원 목록 페이지로 이동
    @PostMapping("/insertMember")
    public String insertMember(MemberVO memberVO){
        // HTML에서 가져온 데이터를 TEST_MEMBER TABLE에 INSERT
        // DB 작업이 있다는걸로 판단되면 쿼리문부터 작성
        // 쿼리는 mapper 파일에서 작성
        memberService.insertMember(memberVO);
        return "redirect:/";
    }
}
