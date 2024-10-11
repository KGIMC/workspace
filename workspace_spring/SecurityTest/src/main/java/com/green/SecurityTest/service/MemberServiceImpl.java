package com.green.SecurityTest.service;

import com.green.SecurityTest.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final SqlSessionTemplate sqlSession;

    @Override
    public void test1() {
        System.out.println(111);
    }

    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

    @Override
    public MemberVO getMemberForLogin(String memId) {
        return sqlSession.selectOne("memberMapper.getMemberForLogin", memId);
    }
}
