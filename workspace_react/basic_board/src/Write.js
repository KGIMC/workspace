import { useState } from 'react';
import './Write.css';
import { useNavigate } from 'react-router-dom';

const Write = ({board_list, setBoardList}) => {

  console.log('등록 전 게시글 목록');
  console.log(board_list);

  // 입력한 모든 정보를 저장하는 state 변수
  const [board, setBoard] = useState({
    boardNum : 0,
    title : '',
    writer : '',
    createDate : '',
    content : '',
  });

  const navigate = useNavigate();

  // 선언된 함수
  function changeBoard(e){
    // 게시글 정보 바꾸기 위해 선언한 함수
    setBoard({
      // setBoard의 객체값을 전개연산자로 풀이.
      ...board,
      // e.target -> 이벤트가 발생한 타겟
      [e.target.name] : e.target.value
    });
  }

  return(
  <>
    <div>
      글번호 <input type='text' name='boardNum' onChange={(e) => {
          changeBoard(e);
      }}/> <br/>
      글제목 <input type='text' name='title' onChange={(e) => {
          changeBoard(e);
      }}/> <br/>
      작성자 <input type='text' name='writer' onChange={(e) => {
          changeBoard(e);
      }}/> <br/>
      작성일 <input type='date' name='createDate' onChange={(e) => {
          changeBoard(e);
      }}/> <br/>
      글내용 <textarea name='content' onChange={(e) => {
          changeBoard(e);
      }}/> <br/>
      <button type="button" onClick={(e) => {
        setBoardList([...board_list, board]);
        navigate('/');
      }} >글등록</button>
    </div>
    
    {/* <div>
      글번호 {board.boardNum} <br/>
      글제목 {board.title} <br/>
      작성자 {board.writer} <br/>
      작성일 {board.createDate} <br/>
      글내용 {board.content} <br/>

    </div> */}
    </>
  );
}

export default Write;