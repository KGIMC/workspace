package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    @Resource(name = "boardService") // 의존성 주입
    private BoardService boardService;

    @RequestMapping("/") // 게시글 목록 페이지 // 가장 첫 페이지
    public String mainPage(Model model, SearchVO searchVO){
        // searchVO 데이터 검사
        System.out.println(searchVO);


        // 목록 조회
        List<BoardVO> boardList = boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardList);
        System.out.println(boardList);
        return "board_list";
    }

    @GetMapping("/write_form")
    public String writeForm(){
        return "write_form";
    }

    @PostMapping("/go_write")
    public String write(BoardVO boardVO){
        // 글등록 + 글목록 페이지로 이동
        boardService.getBoardInsert(boardVO);
        return "redirect:/";
    }

    @GetMapping("/board_detail")
    public String detail(@RequestParam(name = "boardNum") int boardNum, Model model){
        // 조회수 증가
        boardService.updateReadCnt(boardNum);

        // boardNum으로 넘어오는 변수를 boardNum으로 저장해서 쓰겠다
        model.addAttribute("board", boardService.getBoardDetail(boardNum));

        return "board_detail";
    }

    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam(name = "boardNum") int boardNum){
        boardService.deleteBoard(boardNum);
        return "redirect:/";
    }

}
