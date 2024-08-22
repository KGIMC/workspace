package com.green.CarSales.sevice;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carService")
public class CarServiceImpl implements CarService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public int insertCar(int modelNum) {
        return sqlSession.insert("carMapper.insertCar", modelNum);

    }
}
