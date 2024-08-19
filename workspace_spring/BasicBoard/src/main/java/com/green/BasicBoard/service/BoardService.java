package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {

    // 게시글 목록 조회
    List<BoardVO> getBoardList(SearchVO searchVO);
    // getBoard에 담을 수 있는 정보 -> 글번호, 제목, 내용 등등 여러가지 다른 종류의 자료형
    // 그걸 담을 수 있는건 BoardVO
    // 게시글 조회기 때문에 여러개가 출력
    // 여러개 출력되려면 List가 필요
    // 그러므로 List<BoardVO>가 됨.

    // 게시글 등록(추가)

    void getBoardInsert(BoardVO boardVO);

    // 게시글 상세 조회

    BoardVO getBoardDetail(int boardNum);
    // 상세조회 하려면 글번호가 필요함.
    // 매개변수를 글번호로 줌 ( 빈값 채울 녀석 )


    // 게시글 삭제

    void deleteBoard(int boardNum);

    // 조회수 증가

    void updateReadCnt(int boardNum);

}
