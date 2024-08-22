package com.green.CarSales.controller;

import com.green.CarSales.sevice.CarService;
import com.green.CarSales.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @Resource(name = "carService")
    private CarService carService;

    @GetMapping("/insertCar/{modelNum}")
    public CarVO insertCar(@PathVariable("modelNum") int modelNum){
        return carService.insertCar(modelNum);
    }

}
