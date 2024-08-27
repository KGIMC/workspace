package com.green.Car.service;

import com.green.Car.vo.CarVO;
import com.green.Car.vo.SalesVO;

public interface SalesService {

    // 구매자 정보 등록? (차량정보도 같이)
    // 구매자가 차량을 한개만 등록하란 법은 없다만 현재로썬 1:1 관계

    void insertBuyer(SalesVO salesVO);

    CarVO selectBuyer(int modelNum);
}
