import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import JoinForm from './pages/JoinForm';
import LoginForm from './pages/LoginForm';
import { useEffect, useState } from 'react';
import BoardWrite from './pages/BoardWrite';
import BoardDetail from './pages/BoardDetail';
import UpdateForm from './pages/UpdateForm';

function App() {
  const navigate = useNavigate();

  const [loginInfo, setLoginInfo] = useState({});

  useEffect(()=> {
    const loginDataString = window.sessionStorage.getItem('loginInfo');

    if(loginDataString != null){
      const loginData = JSON.parse(loginDataString);
      setLoginInfo(loginData);
    }

  }, []);

  return (
    <div className="container">
      <div className='header'>
        <div>
          {
            loginInfo.memId == null 
            ? 
            <>
              <span onClick={(e) => {navigate('/loginForm')}}>Login</span>
              <span onClick={(e) => {navigate('/joinForm')}}>Join</span>
            </>
            : 
            <div>
              {loginInfo.memId}님 반갑습니다.
              <span onClick={(e) => {
                //세션스토리지에 저장된 로그인 정보를 제거
                window.sessionStorage.removeItem('loginInfo');
                setLoginInfo({});
                alert('로그아웃!');
                navigate('/');
              }}>Logout</span>
            </div>
          }

        </div>
        <h1>자 유 게 시 판</h1>
      </div>
      <div className='content'>
        <Routes>
          {/* 게시글 목록 페이지 */}
          <Route path='/' element={ <BoardList loginInfo={loginInfo}/> } />

          {/* 회원가입 페이지 */}
          <Route path='/joinForm' element={ <JoinForm /> } />

          {/* 로그인 페이지 */}
          <Route path='/loginForm' element={ <LoginForm setLoginInfo={setLoginInfo}/> } />

          {/* 게시글 작성 페이지 */}
          <Route path='/writeForm' element={ <BoardWrite loginInfo={loginInfo}/> }/>

          {/* 게시글 상세 페이지 */}
          <Route path='/detail/:boardNum' element={ <BoardDetail loginInfo={loginInfo}/> }/>

          {/* 게시글 수정 페이지 */}
          <Route path='/updateForm/:boardNum' element={ <UpdateForm /> } />

        </Routes>
      </div>
    </div>
  );
}

export default App;
