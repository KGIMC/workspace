package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Resource(name = "studentService")
    private StudentService studentService;


    // 학생 목록 조회
    // 목록 조회는 화면에 뿌리기만 하면 되서 리턴값 x
    @GetMapping("/getStuList")
    public List<StudentVO> getStuList(){
        return studentService.getStuList();
    }


    // 학생 등록
    // ? 등록도 리턴이 없나?
    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
        studentService.insertStudent(studentVO);
    }


    // 학생 상세 조회
    @GetMapping("/getStuDetail/{stuNum}")
    // url 로 넘어오는 데이터 받을땐 PathVariable
    public StudentVO getStuDetail(@PathVariable("stuNum") int stuNum) {
       return studentService.getStuDetail(stuNum);
    }


    // 학생 삭제
    @DeleteMapping("/deleteStudent/{stuNum}")
    public void deleteStudent(@PathVariable("stuNum") int stuNum){
        studentService.deleteStudent(stuNum);
    }

    // 점수 변경
    @PutMapping("/updateScore")
    public void updateScore(@RequestBody StudentVO studentVO){
        studentService.updateScore(studentVO);
    }


}
