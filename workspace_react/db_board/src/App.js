import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';
import AxiosTest from './AxiosTest';
import BoardDetail from './BoardDetail';
import WriteForm from './WriteForm';

function App() {

  

  return (
    <div className="App">

      <Routes>

        {/* axios 예제 페이지 */}
        <Route path='/axios' element={<AxiosTest />}/>

        {/* 게시글 목록 페이지 */}
        <Route path='/boardList' element={<BoardList />}/>

        {/* 상세 정보 페이지(게시글 상세 조회) */}
        <Route path='/detail/:boardNum' element={<BoardDetail />}/>
        {/* 넘길때 글번호를 찝어서 보내므로 글번호 같이 */}
        
        {/* 글 등록 페이지 */}
        <Route path='/writeForm' element={<WriteForm />} />
      </Routes>

    </div>
  );
}

export default App;
