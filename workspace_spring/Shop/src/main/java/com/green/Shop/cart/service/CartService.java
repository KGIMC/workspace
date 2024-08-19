package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;

import java.util.List;

public interface CartService {

    //장바구니 등록
    void insertCart(CartVO cartVO);

    //장바구니 목록 조회
    List<CartVO> getCartList(String memId);

}
