package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;

public interface MemberService {

    //회원 가입
    void join(MemberVO memberVO);

    //아이디 중복확인
    //사용 가능 : true, 사용 불가 : false
    boolean isEnableId(String memId);

    //로그인
    MemberVO login(MemberVO memberVO);

}
