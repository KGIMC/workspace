package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReactController {

    @Resource(name = "boardService") // 의존성 주입
    private BoardService boardService;


    // 게시글 목록 페이지 // 가장 첫 페이지
    @RequestMapping("/list")
    public List<BoardVO> mainPage(Model model, SearchVO searchVO){

        // 목록 조회
        List<BoardVO> boardList = boardService.getBoardList(searchVO);
        return boardList;
    }


}
