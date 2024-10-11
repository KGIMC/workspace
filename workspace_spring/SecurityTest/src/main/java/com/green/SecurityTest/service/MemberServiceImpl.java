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

@Service("memberService")
@RequiredArgsConstructor // final이 붙어있는 변수를 매개변수로 갖는 생성자
public class MemberServiceImpl implements MemberService{
    //생성자 주입
    //기존과 달리진점
    // 1. 선언한 객체 위의 어노테이션 사라짐
    // 2. 선언한 변수에 final 키워드가 붙는다
    // 3. 클래스에  @RequiredArgsConstructor 아노테이션이 붙는다.
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
