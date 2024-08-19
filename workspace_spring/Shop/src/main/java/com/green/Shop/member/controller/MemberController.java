package com.green.Shop.member.controller;

import com.green.Shop.member.service.MemberService;
import com.green.Shop.member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api_member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;

    //회원 가입
    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        memberService.join(memberVO);
    }

    //아이디 중복 체크
    @GetMapping("/isEnableId/{memId}")
    public boolean isEnableId(@PathVariable("memId") String memId){
        //사용가능 id -> result : true
        boolean result = memberService.isEnableId(memId);
        return result;
    }

    //로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO){
        //id, pw이 잘못되면 null 데이터가 나온다
        return memberService.login(memberVO);
    }


}








