package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getBoardList() {
         List<BoardVO> boardList = sqlSession.selectList("boardMapper.getBoardList");
         return boardList;
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
         return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }


}
