package com.green.Board.service;

import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {

    //댓글 목록 조회
    List<ReplyVO> getReplyList(int boardNum);

    //댓글 등록
    void insertReply(ReplyVO replyVO);

    //댓글 삭제
    void deleteReply(int replyNum);

}








