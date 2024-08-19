package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {

    // 학생 목록 조회
    public List<StudentVO> getStuList();

    // 학생 등록
    void insertStudent(StudentVO studentVO);

    // 학생 상세 정보 조회
    StudentVO getStuDetail(int stuNum);

    // 학생 삭제
    void deleteStudent(int stuNum);

    // 점수 등록(변경)
    void updateScore(StudentVO studentVO);
}
