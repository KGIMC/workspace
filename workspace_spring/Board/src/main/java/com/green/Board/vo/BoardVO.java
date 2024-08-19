package com.green.Board.vo;

import lombok.Data;

import java.util.List;

@Data
public class BoardVO {
    private int boardNum;
    private String title;
    private String content;
    private String memId;
    private String createDate;
}
