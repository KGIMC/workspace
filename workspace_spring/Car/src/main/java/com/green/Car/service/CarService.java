package com.green.Car.service;


import com.green.Car.vo.CarVO;

import java.util.List;

public interface CarService {

    // 차량 정보 등록
    void insertCar(CarVO carVO);

    // 등록된 차량 조회
    List<CarVO> getCarList();

}
