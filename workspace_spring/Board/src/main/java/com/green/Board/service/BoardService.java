package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {

    //게시글 목록 조회
    List<BoardVO> getBoardList(PageVO pageVO);

    //게시글 등록
    void insertBoard(BoardVO boardVO);

    //게시글 상세 조회
    BoardVO getBoardDetail(int boardNum);

    //게시글 삭제
    void deleteBoard(int boardNum);

    //게시글 수정
    void updateBoard(BoardVO boardVO);

    // 전체 게시글 갯수 조회
    int getBoardCnt();

}







