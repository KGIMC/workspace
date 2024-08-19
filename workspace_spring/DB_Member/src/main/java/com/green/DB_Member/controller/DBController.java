package com.green.DB_Member.controller;

import com.green.DB_Member.service.DBServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DBController {
    @Resource(name = "dbService")
    private DBServiceImpl dbService;

    // 회원번호가 10번인 학생의 이름을 조회하는 기능
    @GetMapping("/select1")
    public String select1(){

        String name = dbService.select1();
        System.out.println("조회한 이름 : " + name);
        return "db_result";
    }

    // 전달된 회원번호를 지닌 회원의 나이를 조회
    @GetMapping("/select2")
    public String select2(){
        int age = dbService.select2(10);
        System.out.println("조회한 회원번호 : " + age);
        return "db_result";
    }


    // 전달받은 나이 이상의 회원의 이름을 조회
    @GetMapping("/select3")
    public String select3(){
        List<String> nameList = dbService.select3(60);

        for(String name : nameList ){ // nameList에서 하나씩 뺀것을 name으로 정의
            System.out.println("조회된 이름 : " + name);
        }
        return "db_result";
    }


    // 전달받은 회원번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select4")
    public String select4(){
        MemberVO member = dbService.select4(11);
        System.out.println(member);
        return "db_result";
    }

    // 모든 회원의 회원번호, 이름, 나이, 주소 조회
    @GetMapping("/select5")
        public String select5(){
            List<MemberVO> list = dbService.select5();
            System.out.println(list);

//        for( MemberVO member : list){
//            System.out.println(member);
//        }
            return "db_result";
        }


    // 전달받은 회원번호를 가진 회원을 삭제
    @GetMapping("/delete")
    public String delete(){
        int result = dbService.delete(67);
        System.out.println("삭제한 행 개수 : " + result);
        return "db_result";
    }

    // 회원 한명 추가
    @GetMapping("/insert")
    public String insert(){
        MemberVO vo = new MemberVO();
        vo.setMemNum(2);
        vo.setMemName("python");
        vo.setMemAge(16);
        vo.setMemAddr("울산시");
        dbService.insert(vo);

        System.out.println(vo);
        return "db_result";
    }

    // 전달받은 회원번호를 지닌 회원의 이름, 나이, 주소를 변경
    @GetMapping("/update")
    public String update(){
        MemberVO vo = new MemberVO();
        vo.setMemNum(2);
        vo.setMemName("김세훈");
        vo.setMemAge(25);
        vo.setMemAddr("제주");

        int result = dbService.update(vo);
        System.out.println("업데이트 된 행 개수 : " + vo);
        return "db_result";
    }

}
