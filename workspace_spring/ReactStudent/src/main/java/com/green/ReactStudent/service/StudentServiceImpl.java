package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<StudentVO> getStuList() {
        return sqlSession.selectList("studentMapper.getStuList");
    }

    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("studentMapper.insertStudent", studentVO);
    }


    // 상세정보 조회
    @Override
    public StudentVO getStuDetail(int stuNum) {
        return sqlSession.selectOne("studentMapper.getStuDetail", stuNum);
    }

    // 학생 삭제
    @Override
    public void deleteStudent(int stuNum) {
        sqlSession.delete("studentMapper.deleteStudent", stuNum);
    }

    @Override
    public void updateScore(StudentVO studentVO) {
        sqlSession.update("studentMapper.updateScore", studentVO);
    }


}
