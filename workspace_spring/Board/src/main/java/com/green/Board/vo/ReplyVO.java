package com.green.Board.vo;

import lombok.Data;

@Data
public class ReplyVO {
    private int replyNum;
    private String replyContent;
    private String replyDate;
    private String memId;
    private int boardNum;
}
