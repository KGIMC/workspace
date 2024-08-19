package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("joinService")
public class JoinServiceImpl implements JoinService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<BoardVO> bbb() {
        return sqlSession.selectList("joinMapper.bbb");
    }

    @Override
    public BoardVO ccc() {
        return sqlSession.selectOne("joinMapper.ccc");
    }
}
