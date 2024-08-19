// 상세보기 화면

import { useNavigate, useParams } from "react-router-dom";

const Detail = ({board_list}) => {
  console.log(board_list)

  // url로 넘어오는 데이터 받기 위해서 
  const navaigate = useNavigate();
  const params = useParams();

  console.log(params);
  const boardNum = params.boardNum;
  
  // 게시글 정보 들어올 곳
  let board = null; 

  for(const e of board_list){
    if(e.boardNum = boardNum){
      board = e;
    }
  }

  return(
    <div>
      <h3>게시글 상세 정보</h3>
      <div>글번호 : {board.boardNum}</div>
      <div>글제목 : {board.title}</div>
      <div>글내용 : {board.content}</div>
      <div>작성자 : {board.writer}</div>
      <div>작성일 : {board.createDate}</div>
      <div>
        <button type="button" onClick={(e) => {
            board_list.forEach((board, i) => {
              if(board.boardNum == boardNum){
                  board_list.splice(i, 1);
              }
            });

        navaigate('/');
        }}>삭제</button>
        
      </div>
    </div>
  );
}

export default Detail;