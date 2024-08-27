package com.green.Car.vo;

import lombok.Data;

import java.util.List;

@Data
public class SalesVO {
    private int salesNum;
    private String buyer;
    private String buyerTel;
    private String color;
    private String salesDate;
    private int modelNum;
    private CarVO carVO;
}
