package com.green.SecurityTest.service;

import com.green.SecurityTest.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
@RequiredArgsConstructor // final 이 붙어있는 변수를 매개변수로 갖는 생성자
public class MemberServiceImpl implements MemberService {

    // 필드 주입
    // @Autowired
    // private SqlSessionTemplate sqlSession;

    // 생성자 주입으로 바꾸기 ( 초기값 필요 )
    // 1. 선언한 객체 위의 @AutoWired 및 @Resource 사라짐.
    // 2. 선언한 변수에 final이 붙음
    // 3. 클래스에 @RequiredArgsConstructor 어노테이션이 붙음.
    private final SqlSessionTemplate sqlSession;

//    public MemberServiceImpl(SqlSessionTemplate sqlSession){
//        this.sqlSession = sqlSession;
//    }

    @Override
    public void test1() {
        System.out.println(111);
    }

    // 회원가입
    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }


}
