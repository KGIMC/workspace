package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLOutput;


@Controller
public class ScoreController {

    // 가장 먼저 실행시키는 페이지
    // 시작페이지로 이동
    @GetMapping("/first")
    public String first(){
        return "score_first";
    }

    // first 페이지에서 확인 누르면 second 페이지로 이동
    @PostMapping("/second")
    public String second(ScoreVO scoreVO){
        // 커맨드 객체 - 매개변수에 내가 만들어둔 클래스
        // ScoreVO라는 커맨드 객체 사용 ( 커맨드 객체 사용 시 동일한 정보 다 가져옴 )
        System.out.println(scoreVO);

        // 출력되는지 확인하기 위한 출력문
        return "score_second";
    }

    // second 페이지에서 확인 누르면 third 페이지로 이동
    @PostMapping("/third")
    public String third(ScoreVO scoreVO){
        System.out.println(scoreVO);
        return "score_third";
    }

    // third 페이지에서 확인 누르면 fourth 페이지로 이동
    @PostMapping("/fourth")
    public String fourth(ScoreVO scoreVO, Model model){
        System.out.println(scoreVO);

        // 평균 - 자바로 계산하기
        // 커맨드 객체로 생성하지 않은건 model 사용
        double avg = (scoreVO.getKorScore() + scoreVO.getEngScore() + scoreVO.getMathScore()) / 3.0;
        model.addAttribute("avg", avg);
        return "score_fourth";
    }


}
