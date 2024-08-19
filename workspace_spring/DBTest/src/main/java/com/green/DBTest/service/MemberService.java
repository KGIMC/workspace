package com.green.DBTest.service;

//인터페이스에는 맴버변수 x, 생성자 x -> 인터페이스는 객체 생성 불가
//오직 추상메서드(메서드의 이름만 존재하고 몸통은 없는 메서드)만 존재
//인터페이스는 단독으로 사용불가! -> 클래스의 정의부분에서 사용을 함
public interface MemberService {
    //TEST_MEMBER 테이블에 데이터 1개 삽입
    void insertMember();

    void insertMember2();

}
