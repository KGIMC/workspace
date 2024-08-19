package com.green.Shop.cart.vo;


import com.green.Shop.item.vo.ItemVO;
import lombok.Data;

@Data
public class CartVO {
        // 장바구니 정보 하나는 아이템 정보 하나만 가짐
        private int cartCode;
        private int itemCode;
        private int cartCnt;
        private String memId;
        private String cartDate;
        private ItemVO itemVO;
}
