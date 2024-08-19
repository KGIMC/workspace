package com.green.ReactBoard.controller;


import com.green.ReactBoard.service.BoardService;
import com.green.ReactBoard.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


// RestController @이 붙은 클래스는 컨트롤러 역할을 한다.
// Controller @과 다른 점
// 1. 해당 클래스의 리턴은 html 파일명이 아님.
// 2. 리턴되는 것은 react로 만든 화면에 보여줄 데이터를 리턴한다.
// 3. 메서드의 리턴 타입을 잘 정해줘야함.
@RestController
public class BoardController {

    @Resource(name = "boardService")
    private BoardService boardService;

    // 게시글 목록 조회
    @GetMapping("/boardList")
        public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = boardService.getBoardList();
        return boardList;
    }

    // 게시글 상세 조회
    @GetMapping("/boardDetail/{boardNum}")
        public BoardVO getBoardDetail(@PathVariable("boardNum") int boardNum){
        return boardService.getBoardDetail(boardNum);
    }




}
