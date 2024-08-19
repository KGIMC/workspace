package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList(PageVO pageVO) {
        return sqlSession.selectList("boardMapper.getBoardList", pageVO);
    }

    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }

    //게시글 삭제 (댓글 + 게시글 삭제)
    @Override
    public void deleteBoard(int boardNum) {
        //댓글 삭제
        sqlSession.delete("replyMapper.deleteReplyByBoardNum", boardNum);

        //게시글 삭제
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }

    @Override
    public int getBoardCnt() {
        return sqlSession.selectOne("boardMapper.getBoardCnt");
    }


}
