package com.green.DB_Score.service;

import com.green.DB_Score.vo.ScoreVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    // 학생 정보 조회
    @Override
    public List<ScoreVO> getStuList() {
        List<ScoreVO> list = sqlSession.selectList("scoreMapper.getStuList");
        return list;
    }

    // 학생 등록
    @Override
    public void insertStudent(ScoreVO scoreVO) {
        sqlSession.insert("scoreMapper.insertStudent", scoreVO);
    }

    // 학생 정보 상세 조회
    @Override
    public ScoreVO getStuDetail(int stuNum) {
        ScoreVO scoreVO = sqlSession.selectOne("scoreMapper.getStuDetail", stuNum);
        // 쿼리의 실행결과 여부에 따라 One, List가 달라짐
        // 0, 1행인 경우 - One
        // 그 외의 경우 - List
        // 현재 One인 경우 PK가 stuNum으로 중복되어있기에 0, 1 둘중에 하나만 나옴.
        return scoreVO;
    }


    // 학생 정보 삭제
    @Override
    public void deleteStudent(int stuNum) {
        sqlSession.delete("scoreMapper.deleteStudent", stuNum);
    }


    // 학생 정보 수정
    @Override
    public void updateStudent(ScoreVO scoreVO) {
        sqlSession.update("scoreMapper.updateStudent", scoreVO);
    }


}
