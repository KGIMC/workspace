package com.green.ReactBoard.vo;

import lombok.Data;

@Data
public class BoardVO {
    private int boardNum;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private String createDate;
}


