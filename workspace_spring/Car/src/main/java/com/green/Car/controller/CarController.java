package com.green.Car.controller;

import com.green.Car.service.CarService;
import com.green.Car.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @Resource(name = "carService")
    private CarService carService;


    @PostMapping("/insert")
    public void insertCar(@RequestBody CarVO carVO){
        carService.insertCar(carVO);
        System.out.println(carVO);
    }
}
