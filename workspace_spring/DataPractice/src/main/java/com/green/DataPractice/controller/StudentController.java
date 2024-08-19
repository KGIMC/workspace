package com.green.DataPractice.controller;

import com.green.DataPractice.service.StudentService;
import com.green.DataPractice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    List<StudentVO> list = new ArrayList<>();
    // 학생 목록 데이터 저장하는 곳
    StudentService studentService = new StudentService(); // 클래스간에 서로 사용 못하기에 객체 만들어줌. (까먹지 말것)

    // 학생정보 목록페이지
    @GetMapping("/stu_list") // model interface가 있어야 전달 가능
    public String stu_list(Model model){
        // 학생 목록 데이터를 html에 전달해야함.
        // model.addAttribute("stu_list", list); // 학생 목록 전달

        // 학생 목록 데이터 받아오기 (자료형 맞춰줄것, 주의)
        List<StudentVO> list = studentService.getStuList();

        // 학생 목록 HTML에 전달
        model.addAttribute("stu_list", list);

        return "stu_list";
    }

    // 학생 등록 페이지
    @GetMapping("/regForm")
    public String reg_student(){
        return "reg_student";
    }

    // 학생 등록 후 목록 페이지로 이동
    @PostMapping("/reg_stu")
    public String reg_stu(StudentVO studentVO){
        // 입력한 정보 - studentVO에 저장
//        list.add(studentVO);
        // 그 정보를 list에 추가


        studentService.regStudent(studentVO);
        return "redirect:/stu_list";
    }

    // 학생 상세페이지로 이동
    @GetMapping("/stu_detail")
    public String stu_detail(@RequestParam(name = "year") int year, Model model){
        // 클릭한 것 -> 이름
        // 클릭한 것과 같이 넘어오는 것 - 학번

        StudentVO student = studentService.stuDetail(year);
        model.addAttribute("student", student);
        return "stu_detail";
    }

    // 학생 삭제하기 + 목록 페이지로 이동
    @GetMapping("/stu_delete")
        public String delete(@RequestParam(name = "year") int year){
            // 학생 삭제
            studentService.deleteStu(year);
            return "redirect:/stu_list";
        }


    @GetMapping("/stu_edit")
    public String stuEdit(@RequestParam(name = "year") int year, Model model){

        // 정보를 수정할 학생의 원래 정보를 html에 전달
        // 1. 정보 수정할 학생 한 명을 정해야함.

        StudentVO studentVO = studentService.stuDetail(year);
        // 2. 수정할 학생을 html로 전달
        model.addAttribute("student", studentVO);
        return "stu_edit";
    }

    // 학생 정보 수정 + 상세 페이지로 이동
    @PostMapping("/update_stu")
        public String updateStu(StudentVO studentVO){
        // 학생 정보 수정
        studentService.updateStu(studentVO);

        return "redirect:/stu_detail?year=" + studentVO.getYear();
    }
}

