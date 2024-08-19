import logo from './logo.svg';
import './App.css';
import data from './data';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';
import Detail from './Detail';
import Write from './Write';
import { useState } from 'react';
import InputTest from './InputTest';



function App() { 

  // board_list엔 게시글 목록 데이터가 다 들어있는 것 
  // let board_list = data;
  const [boardList, setBoardList] = useState(data);

  return (
    <div className="App">
      {/* 아래 Routes, Route 작성해서 path 및 elemnet 작성해야 페이지 이동하는 기능 작동함. */}
      <Routes>
      {/* 게시글 목록 페이지 */}
      <Route path='/' element={<BoardList board_list={boardList}/>} />;
      {/* 게시글 상세 정보 페이지 */}
      <Route path='/detail/:boardNum' element={<Detail board_list={boardList}/>} />;
      {/* '/detail/:boardNum' detail 뒤에 boardNum을 적으면 detail 페이지는 오면서 boardNum 데이터를 가져가는 것 */}
      {/* 글쓰기 페이지 */}
      <Route path='/writerForm' element={<Write board_list={boardList} setBoardList={setBoardList} />}></Route>
      {/* input값 입력받기 연습 */}
      <Route path='/test' element={<InputTest />}/>
      </Routes>
    </div>
  );
}

export default App;
