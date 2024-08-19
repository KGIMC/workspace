package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;

import java.lang.reflect.Member;
import java.util.List;

// 인터페이스에서는 작성한 쿼리를 실행할 메소드를 정의
// 메소드의 매개변수 : 실행할 쿼리의 빈값을 채워주는 데이터
// 메소드의 리턴타입 : 쿼리 실행결과 데이터베이스에서 가져오는 데이터 타입
public interface DBService {

    // 회원번호가 10번인 회원의 이름을 조회하는 쿼리를 실행할 메소드
    String select1();


    // 전달된 회원번호를 지닌 회원의 나이를 조회
    // (int memNum) 변수명으로 memNum을 가져감.
    int select2(int memNum);


    // 전달받은 나이 이상의 회원의 이름을 조회
    List<String> select3(int memAge);
    // 문자열 여러개를 다 받아와야하기에 List로 받아옴.


    // 전달받은 회원번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    MemberVO select4(int memNum);

    // 모든 회원의 회원번호, 이름, 나이, 주소 조회
    List<MemberVO> select5();

    // delete, update, insert 리턴 타입 : void, int
    // void 쓰는 이유 : 실행해서 데이터베이스에서 가져올 자료가 없으면 void
    // int 쓰는 이유 : DB에서 영향을 받은 행의 개수가 출력됨.
    // 전달받은 회원번호를 가진 회원을 삭제
    int delete(int memNum);


    void insert(MemberVO memberVO);

    // 전달받은 회원번호를 지닌 회원의 이름, 나이, 주소를 변경

    int update(MemberVO memberVO);

}
