package com.green.Shop.item.service;

import com.green.Shop.item.vo.ItemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //상품 목록 조회
    @Override
    public List<ItemVO> getItemList() {
        return sqlSession.selectList("itemMapper.getItemList");
    }

    @Override
    public ItemVO getItemDetail(int itemCode) {
        return sqlSession.selectOne("itemMapper.getItemDetail", itemCode);
    }
}
