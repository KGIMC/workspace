package com.green.Shop.admin.service;

import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;

import java.util.List;

public interface AdminService {

    //카테고리 목록 조회
    List<CategoryVO> getCategoryList();

    //상품등록
    void insertItem(ItemVO itemVO);

    //상품이미지등록
    void insertImgs(ItemVO itemVO);

    //다음에 들어갈 item_code 조회
    int getNextItemCode();

}








