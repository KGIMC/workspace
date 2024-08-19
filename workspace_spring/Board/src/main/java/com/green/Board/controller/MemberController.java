package com.green.Board.controller;

import com.green.Board.service.MemberService;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j //로그 남길 떄 쓰는 어노체이션, 모든 클래스 위에서 사용 가능
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;

    //아이디 중복 확인
    @GetMapping("/checkId/{inputId}")
    public boolean checkId(@PathVariable("inputId") String inputId){
        System.out.println("java");
        log.info("=============java==============");

        //true -> 아이디 사용 불가능
        //false -> 아이디 사용 가능
        return memberService.isDuplicateId(inputId);
    }

    //회원가입
    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        log.info(" ============= join() 메서드 실행  ================");
        log.info("=== memberVO에 전달된 데이터 =======");
        log.info(memberVO.toString());
        log.info("=== 데이터 확인 끝 =======");

        memberService.join(memberVO);
    }

    //로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO){
        //조회된 데이터가 없으면 member는 null이 된다!
        MemberVO member = memberService.login(memberVO);
        return member;
    }

}










