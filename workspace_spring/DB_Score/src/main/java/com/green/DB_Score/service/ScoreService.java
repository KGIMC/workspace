package com.green.DB_Score.service;

import com.green.DB_Score.vo.ScoreVO;

import java.util.List;

public interface ScoreService {

   // 학생 조회하는 쿼리
   List<ScoreVO> getStuList();

   // 학생 1명 추가
   // 학번, 이름, 국어점수, 영어점수의 다양한 정보를 등록만 해주면 되기 때문에 리턴타입 필요 없음
   // 빈값을 채우기 위해선 매개변수에 적어준다.
   // ex) 만약 4개의 빈값을 채우려면 4개의 값 모두 가지고 있는 vo를 사용
   // ex) 1개의 빈값을 채우려면 해당 값에 맞는 변수 사용 -> int, String
   // ex) 동일한 값 여러개를 채우려면 List 사용
   // 학생 등록하는 쿼리
   void insertStudent(ScoreVO scoreVO);


   // 학생 상세조회 하는 쿼리
   ScoreVO getStuDetail(int stuNum); // 상세조회된 정보 5개 다 담을 수 있는 자료형은 scoreVO뿐.
   // mapper에서 작성한 쿼리문에서 빈값은 ${stuNum} 뿐임.
   // select 타입은 return 타입 생각할 것.

   // 학생 삭제
   void deleteStudent(int stuNum);

   // 학생 수정
   void updateStudent(ScoreVO scoreVO);



}
