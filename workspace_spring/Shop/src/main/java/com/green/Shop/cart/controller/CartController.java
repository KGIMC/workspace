package com.green.Shop.cart.controller;

import com.green.Shop.cart.service.CartService;
import com.green.Shop.cart.vo.CartVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api_cart")
public class CartController {
    @Resource(name = "cartService")
    private CartService cartService;

    //장바구니에 상품 등록
    @PostMapping("/insert")
    public void insertCart(@RequestBody CartVO cartVO){
        cartService.insertCart(cartVO);
    }

    //장바구니 목록 조회
    @GetMapping("/getCartList/{memId}")
    public List<CartVO> getCartList(@PathVariable("memId") String memId){
        return cartService.getCartList(memId);
    }

}









