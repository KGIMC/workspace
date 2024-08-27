package com.green.Car.service;


import com.green.Car.vo.CarVO;
import com.green.Car.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("salesService")
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insertBuyer(SalesVO salesVO) {
        sqlSession.insert("salesMapper.insertBuyer", salesVO);
    }

    @Override
    public CarVO selectBuyer(int modelNum) {
        return sqlSession.selectOne("salesMapper.selectBuyer", modelNum);
    }
}
