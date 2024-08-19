package com.green.Board.service;

import com.green.Board.vo.MemberVO;

public interface MemberService {

    //아이디 중복 확인
    boolean isDuplicateId(String memId);

    //회원가입
    void join(MemberVO memberVO);

    //로그인
    MemberVO login(MemberVO memberVO);


}
