import axios from "axios";
import { useEffect } from "react";


const WriteForm = () => {

  useEffect(()=>{
    axios
    .post('/boardList')
    .then((res)=>{
      console.log("조회 성공")
    })
    .catch((res)=>{
      console.log("axios 통신 오류")
    })
  })

  return(
    <div>
      <div>글제목 : <input type="text" /></div>
      <div>글내용 : <input type="text" /></div>
      <div>작성자 : <input type="text" /></div>
      <button type="button">글등록</button>
    </div>
  );
}

export default WriteForm;