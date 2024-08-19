package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    // 시작 페이지 (주문정보페이지)
    // localhost:8080/order를 하면 맨 첫 화면으로 가야함.
    @GetMapping("/order")
    public String order(){
        return "order";
    }

    // 배달정보페이지
    // order에서 주문하기 누르면 delivery 페이지로 이동
    @PostMapping("/delivery")
    public String delivery(OrderVO orderVO){
        System.out.println(orderVO);
        return "delivery";
    }

    // 주문 및 배달 정보 확인 페이지
    @PostMapping("/order_info")
    public String order_info(OrderVO orderVO, DeliveryVO deliveryVO){
        System.out.println(orderVO);
        System.out.println(deliveryVO);
        return "order_info";
    }
}
