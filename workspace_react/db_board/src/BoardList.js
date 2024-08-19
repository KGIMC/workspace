import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const BoardList = () => {
  // 게시글 목록을 저장(가지고)할 변수 (state로 만들기)
  // 게시글 목록(리스트)을 가져오는 것이기 때문에 useState 값에는 빈배열 주기
  const [boardList, setBoardList] = useState([]);
  const navigate = useNavigate();

  // 게시글 목록 조회하는 기능
  useEffect(() => {
  axios
  .get('/boardList')
  .then((res) => {
    console.log(res.data)
    setBoardList(res.data);
  })
  .catch((error) => {
    alert('오류 발생!!\n개발자모드로 콘솔 확인');
    console.log(error);
  })
  }, []);


  return(
    <>
    <table>
      <thead>
        <tr>
          <td>글번호</td>
          <td>제  목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
      </thead>
      <tbody>
        {
          boardList.map((board, i)=>{
            return(
              <tr key={i}>
                <td>{board.boardNum}</td>
                <td>
                  <span onClick={() => { 
                    navigate(`/detail/${board.boardNum}`);
                  }}>{board.boardTitle}</span>
                </td>
                <td>{board.boardWriter}</td>
                <td>{board.createDate}</td>
              </tr>
            );
          })
        }
      </tbody>
    </table>
      <button type="button" onClick={()=>{
        navigate('/writeForm')
      }}>글등록하러가기</button>
    </>
  );
}

export default BoardList;

