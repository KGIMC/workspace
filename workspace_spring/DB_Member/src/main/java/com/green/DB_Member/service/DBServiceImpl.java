package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

@Service("dbService") // Service를 붙인 이유 = Impl에 대한 객체 생성을 위함.
public class DBServiceImpl implements DBService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    // 실행할 쿼리가 select면 selectOne 혹은 selectList() 메소드 중 하나 사용
    // 조회 결과 데이터가 0행 혹은 1행이면 selectOne
    // 조회 결과 데이터의 행 개수가 고정되지 않으면 무조건 selectList
    // 회원번호가 10번인 회원의 이름을 조회하는 쿼리를 실행할 메소드


    // 회원번호가 10번인 학생의 이름을 조회하는 기능
    @Override
    public String select1() {
        String name = sqlSession.selectOne("dbMapper.select1");
        return name;
    }


    // 전달된 회원번호를 지닌 회원의 나이를 조회
    @Override
    public int select2(int memNum) {
        int age = sqlSession.selectOne("dbMapper.select2", memNum);
        return age;
    }

    // 전달받은 나이 이상의 회원의 이름을 조회
    @Override
    public List<String> select3(int memAge) {
        List<String> nameList = sqlSession.selectList("dbMapper.select3", memAge);
        return nameList;
    }


    // 전달받은 회원번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    @Override
    public MemberVO select4(int memNum) {
        MemberVO member = sqlSession.selectOne("dbMapper.select4", memNum);
        return member;
    }


    // 모든 회원의 회원번호, 이름, 나이, 주소 조회
    @Override
    public List<MemberVO> select5() {
        List<MemberVO> list = sqlSession.selectList("dbMapper.select5");
        return list;
    }

    // 전달받은 회원번호를 가진 회원을 삭제
    @Override
    public int delete(int memNum) {
        int result = sqlSession.delete("dbMapper.delete", memNum);
        return result;
    }

    @Override
    public void insert(MemberVO memberVO) {
        sqlSession.insert("dbMapper.insert", memberVO);
    }

    // 전달받은 회원번호를 지닌 회원의 이름, 나이, 주소를 변경
    @Override
    public int update(MemberVO memberVO) {
        int result = sqlSession.update("dbMapper.update", memberVO);
        return result;
    }


}
