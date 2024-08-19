package com.green.DB_Score.controller;


import com.green.DB_Score.service.ScoreService;
import com.green.DB_Score.service.ScoreServiceImpl;
import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ScoreController {

    @Resource(name = "scoreService")
    private ScoreServiceImpl scoreService;

    @GetMapping("/") // 시작 페이지로 이동만 하는 것
    public String studentList(Model model) {
        // 학생 목록 데이터 DB에서 가져와서 조회
        List<ScoreVO> stuList = scoreService.getStuList();
        model.addAttribute("stuList", stuList);
        System.out.println("학생 목록 : " + stuList);
        return "stu_list";
    }


    @GetMapping("/regForm") // 학생 등록 페이지로 이동만 하는 것
    public String regStuForm(){
        // DB 작업 필요 여부 판단 확실히 할 것 ( 이거 잘못하면 계속 꼬임 )
        return "reg_stu";
    }

    @PostMapping("/reg")
    public String reg(ScoreVO scoreVO){ // reg 뒤의 (ScoreVO scoreVO)는 데이터 다 받아오게 만드는 커맨드 객체
        // DB 작업 여부 판단
        // 학생 등록 -> 목록 페이지로 이동하기
            scoreService.insertStudent(scoreVO);
        return "redirect:/";
    }

//    @GetMapping("/student_detail") // 커맨드 객체식
//    public String stuDetail(ScoreVO scoreVO){ // 커맨드 객체 사용한 것
//        // 학생 이름 클릭 시 학생의 정보 - DB에서 조회한 다음에
//        // 올때 학번 데이터도 같이 들고와야함.
//            scoreService.getStuDetail(scoreVO.getStuNum());
//        return "student_detail";
//    }


    @GetMapping("/student_detail") // RequestParam 식
    public String stuDetail(@RequestParam(name = "stuNum") int stuNum, Model model){
        // 학생 이름 클릭 시 학생의 정보 - DB에서 조회한 다음에
        // 올때 학번 데이터도 같이 들고와야함.
        ScoreVO score = scoreService.getStuDetail(stuNum);

        // 저장한 정보 HTML로 전달하기 -> Model interface 사용
        model.addAttribute("score", score);

        return "student_detail";
    }

    // 학생 삭제 + 목록 페이지로 이동
    @GetMapping("/delete") // stuNum이란 이름으로 데이터가 넘어오면 받아서 해당 번호 삭제
    public String delete(@RequestParam(name = "stuNum") int stuNum){
            scoreService.deleteStudent(stuNum);
        return "redirect:/";
    }

    // 수정할 수 있는 페이지로 이동
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name = "stuNum") int stuNum, Model model){

        // 정보를 수정할 학생 조회한 뒤에 HTML로 전달
        ScoreVO score = scoreService.getStuDetail(stuNum);
        model.addAttribute("score", score);
        return "update_student";
    }

    // 학생 정보를 수정 + 상세 페이지로 이동
    @PostMapping("/updateStudent")
    public String updateStudent(ScoreVO scoreVO){
        // 모든 데이터를 받아오지만, 수정하려는 학번 데이터를 알기 위해
        // 학번 데이터를 받아와서 그대로 전달해줌.
        scoreService.updateStudent(scoreVO);
        return "redirect:/student_detail?stuNum=" + scoreVO.getStuNum();
    }
}
