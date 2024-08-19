package com.green.Board.vo;

import lombok.Data;

@Data
public class SearchVO {
    private String searchType;
    private String searchValue;
    private int pageNo;
}
