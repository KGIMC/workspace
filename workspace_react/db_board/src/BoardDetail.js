import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const BoardDetail = () => {
  // route로 전달되는 데이터를 받을때 useParam
  const params = useParams();

  // 상세 정보를 저장할 state 변수
  const [board, setBoard] = useState({});
  
  useEffect(()=>{
    axios
      .get(`/boardDetail/${params.boardNum}`)
      // 데이터 파람으로 받아와서 넘기려면 `` 그 안에 param은 객체임.
      .then((res)=>{
        console.log("조회 성공")
        setBoard(res.data);
      })
      .catch((error)=>{
        console.log("axios 통신 중 오류")
      })
    }, []);

  return(
    // DB에서 상세 조회한 내용을 화면에 출력

    <div>
      <h3>상세보기 페이지</h3>
      <div>글번호 : {board.boardNum}</div>
      <div>글제목 : {board.boardTitle} <br/></div>
      <div>글내용 : {board.boardContent}</div>
      <div>작성자 : {board.boardWriter}</div>
      <div>작성일 : {board.createDate}</div>
    </div>
  );
}

export default BoardDetail;