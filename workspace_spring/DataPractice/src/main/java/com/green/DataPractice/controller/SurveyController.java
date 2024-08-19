package com.green.DataPractice.controller;

import com.green.DataPractice.vo.SurveyVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurveyController {

    @GetMapping("/survey")
    public String goSurvey(){
        return "survey";
    }

    @PostMapping("/join_survey")
    public String joinSurvey(SurveyVO surveyVO, Model model){
        System.out.println("자기소개 : " + surveyVO.getTextarea());
        System.out.println("성별 : " + surveyVO.getGender());
        System.out.println("취미 : " + surveyVO.getHobbies());
        System.out.println("가입경로 : " + surveyVO.getJoin());

        model.addAttribute("joinSurvey", surveyVO);
        return "join_survey";
    }
}
