package com.green.BasicBoard.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int boardNum;
    private String title;
    private String writer;
    private String content;
    private String createDate;
    private int readCnt;
}
