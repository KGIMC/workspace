package com.green.Shop2.member.controller;


import com.green.Shop2.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;
}
