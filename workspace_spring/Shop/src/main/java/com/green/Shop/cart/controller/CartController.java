package com.green.Shop.cart.controller;


import com.green.Shop.cart.service.CartSerivce;
import com.green.Shop.cart.vo.CartVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_cart")
public class CartController {

    @Resource(name = "cartService")
    private CartSerivce cartSerivce;

    // 장바구니 상품 등록
    @PostMapping("/insert")
        public void insertCart(@RequestBody CartVO cartVO) {
            cartSerivce.insertCart(cartVO);
    }

    // 장바구니 조회
    @GetMapping("/getCartList/{memId}")
        public List<CartVO> getCartList(@PathVariable("memId") String memId){
            return cartSerivce.getCartList(memId);
    }

}
