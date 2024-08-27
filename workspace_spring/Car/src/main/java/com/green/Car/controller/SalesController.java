package com.green.Car.controller;


import com.green.Car.service.SalesService;
import com.green.Car.vo.CarVO;
import com.green.Car.vo.SalesVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Resource(name = "salesService")
    private SalesService salesService;


    // 구매자 정보 등록
    @PostMapping("/insert")
    public void insertBuyer(@RequestBody SalesVO salesVO){
        salesService.insertBuyer(salesVO);
    }

    // 구매자 정보 조회
    @GetMapping("/getBuyer")
    public CarVO selectBuyer(@PathVariable("modelNum") int modelNum){
        return salesService.selectBuyer(modelNum);
    }
}
