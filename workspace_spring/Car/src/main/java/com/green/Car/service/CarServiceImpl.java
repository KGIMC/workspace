package com.green.Car.service;

import com.green.Car.vo.CarVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carService")
public class CarServiceImpl implements CarService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insertCar(CarVO carVO) {
        sqlSession.insert("carMapper.insertCar", carVO);
    }
}
