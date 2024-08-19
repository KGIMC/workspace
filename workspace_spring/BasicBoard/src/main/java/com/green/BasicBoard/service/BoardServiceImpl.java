package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService") // boardService라는 이름을 사용하기 위해 이름을 선언
public class BoardServiceImpl implements BoardService{


    @Autowired
    private SqlSessionTemplate sqlSession;

    // 게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
        return sqlSession.selectList("boardMapper.getBoardList", searchVO);
    }

    @Override
    public void getBoardInsert(BoardVO boardVO) {
        sqlSession.insert("boardMapper.getBoardInsert", boardVO);
    }


    // 게시글 상세 조회
    @Override
    public BoardVO getBoardDetail(int boardNum) {
        return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }


    // 게시글 삭제
    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    // 조회수 증가
    @Override
    public void updateReadCnt(int boardNum) {
        sqlSession.update("boardMapper.updateReadCnt", boardNum);
    }


}
