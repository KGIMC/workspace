package com.self.Board.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int boardNum;
    private String title;
    private String content;
    private String memId;
    private String createDate;
}
