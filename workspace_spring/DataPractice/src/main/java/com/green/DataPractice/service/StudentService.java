package com.green.DataPractice.service;


import com.green.DataPractice.vo.StudentVO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

// 학생 관리 프로그램의 핵심 기능 담당
public class StudentService {
    // 학생 여러명 저장할 수 있는 공간
    List<StudentVO> list = new ArrayList<>();


    // 학생 목록 조회 기능
    public List<StudentVO> getStuList() {
        return list;
        // 학생 데이터를 얻어오겠다
        // list를 불러오면 됨.
    }

    // 학생 등록 기능
    public void regStudent(StudentVO studentVO) {
        list.add(studentVO);
    }

    // 학생 상세 조회 기능
    public StudentVO stuDetail(int year) {
        // 내가 클릭한 학생 한명을 검색

        // 학번이 일치하는 학생을 저장할 공간
        StudentVO findStudent = null;

        for (StudentVO studentVO : list) {
            if (studentVO.getYear() == year)
                findStudent = studentVO;
        }
        return findStudent;
    }

    // 학생 삭제

    public void deleteStu(int year) {
        // OO 위치에 있는 정보를 지우겠다는 식으로 접근하기.
        // 삭제를 위해서는 삭제할 정보의 인덱스 번호
        // index를 알기 위해서는 학번 데이터가 필요
        int index = 0;

        // 찾은 i 값을 index에 저장
        // 찾은 i는 삭제할때 필요한 정보
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getYear() == year) {
                index = 1;
            }
        }
        list.remove(index);
    }

    public void updateStu(StudentVO studentVO){
        // list에서 정보를 수정하고자 하는 학생을 찾아서
        // 그 학생의 정보를 input 태그 및 textarea에서 입력한 정보로 변경

        for(StudentVO student : list){
            if(student.getYear() == studentVO.getYear()){
                student.setName(studentVO.getName());
                student.setKorScore(studentVO.getKorScore());
                student.setEngScore(studentVO.getEngScore());
                student.setIntro(studentVO.getIntro());
            }
        }
    }

}

