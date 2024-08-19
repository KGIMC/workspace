package com.green.AxiosTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// 리액트 쓰려면 @Controller@ 말고 @RestController 사용
// RestController : 컨트롤러 안의 메서드 리턴이 html 파일명이 아님.

@RestController
public class AxiosController {

    @GetMapping("/test1")
        public String test1(){
        // 임시로 html 파일과 같은 기능을 하는 파일을 만들어 화면을 보여주고,
        // return된 내용이 화면에 표시됨.
            return "집에 가고 싶다";
    }

    @GetMapping("/test2")
    public int test2(){
        return 100;
    }


    @GetMapping("/test3")
    public int[] test3(){
        int[] arr = {1, 2, 3, 4, 5};
        return arr;
    }

    @GetMapping("/test4")
    public List<ItemVO> test4(){
        // ItemVO 객체를 3개 만들고 리액트로 전달하기

        ItemVO item1 = new ItemVO(1, "처음 만나는 자바", 20000, "자바 초보자를 위한 책", "book_1.jpg");
        ItemVO item2 = new ItemVO(2, "자바 디자인 패턴", 30000, "자바 디자인 패턴 배우기", "book_2.jpg");
        ItemVO item3 = new ItemVO(3, "모두의 딥러닝 책", 40000, "모두의 딥러닝 책 팝니다", "book_3.jpg");

        // 위에 만든 객체를 List<ItemVO> 라는 itemList 통에 담기
        List<ItemVO> itemList = new ArrayList<>();

        // 담는 방법 ( add로 담기 )
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        return itemList;

        // VSCODE App.js 에 똑같은 방식으로 전달 중인 것
    }

}
