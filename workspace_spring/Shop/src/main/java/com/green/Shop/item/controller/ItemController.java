package com.green.Shop.item.controller;

import com.green.Shop.item.service.ItemService;
import com.green.Shop.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api_item")
public class ItemController {
    @Resource(name = "itemService")
    private ItemService itemService;

    //상품 목록 조회
    @GetMapping("/itemList")
    public List<ItemVO> itemList(){
        return itemService.getItemList();
    }

    //상품 상세 정보 조회
    @GetMapping("/getItemDetail/{itemCode}")
    public ItemVO getItemDetail(@PathVariable("itemCode") int itemCode){
        return itemService.getItemDetail(itemCode);
    }

}











