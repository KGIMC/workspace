import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {

  // 상세보기
  const [isShow, setIsShow] = useState(false);
  const [index, setIndex] = useState(0);
  

  const board_list = [
  {
    boardNum : 1,
    title : '첫번째 게시글',
    content : '내용',
    writer : '김자바'
  }, 
  {
    boardNum : 2,
    title : '두번째 게시글',
    content : '내용2',
    writer : '김자바2'

  }, 
  {
    boardNum : 3,
    title : '세번째 게시글',
    content : '내용3',
    writer : '김자바3'
  }
];

  return (
    <div className="App">
     <div className='container'>
      <table>
        <thead>
          <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>작성자</td>
          </tr>
        </thead>
        <tbody>
          {/* board_list 안의 내용이 나와야 하는 공간 */}
          {/* 반복 돌려야함. */}
          {
            board_list.map((board, i)=>{
              return (
                <tr key={i}>
                  {/* key값은 i 말고도 중복되지 않는 값만 넣어주면 상관이 없다. */}
                  <td>{board.boardNum}</td>
                  <td>
                    <span className='title-span' onClick={()=>{
                      setIsShow(true)
                      setIndex(i);
                    }}>{board.title}</span>
                  </td>
                  <td>{board.writer}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>

          {
            isShow ? <Detail board={board_list[index]}/> : null
          }


     </div>
         
     
    </div>
  );
}

// 상세보기 컴포넌트
function Detail(props){
  return(
  <div className='detail'>
        글번호 : {props.board.boardNum}<br/>
        글제목 : {props.board.title}<br/>
        글내용 : {props.board.content}<br/>
        작성자 : {props.board.writer}<br/>
  </div>
  );
}


export default App;
