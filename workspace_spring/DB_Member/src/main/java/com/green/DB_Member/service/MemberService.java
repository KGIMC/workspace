package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;

// TEST_MEMBER DB 조작 기능 정의
public interface MemberService {

    // 회원 목록 조회 / SELECT
    // 회원 상세 정보 조회 / SELECT
    // 회원 정보 등록 / INSERT
    void insertMember(MemberVO memberVO);


    // 회원 삭제 기능 / DELETE
    // 회원 정보 수정 / UPDATE

}
