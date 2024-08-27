package com.green.Car.controller;

import com.green.Car.service.CarService;
import com.green.Car.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Resource(name = "carService")
    private CarService carService;


    // 차량 등록
    @PostMapping("/insert")
    public void insertCar(@RequestBody CarVO carVO){
        carService.insertCar(carVO);
        System.out.println(carVO);
    }

    // 등록 차량 조회
    @GetMapping("/getCarList")
    public List<CarVO> getCarList(){
        return carService.getCarList();
    }

}
