package com.green.Shop2.member.service;

import com.green.Shop2.member.vo.MemberVO;

public interface MemberService {

    // 회원가입 -> 가입하려면 회원에 대한 정보가 필요함.
    // 해당 정보가 다 들어있는 곳은 memberVO임
    // memberVO 매개변수로 넘겨주기
    void join(MemberVO memberVO);
}
