import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Main from './Main';
import Join from './Join';
import Login from './Login';

function App() {
  return (
    <div className="App">
      
      <Routes>
        {/* 메인페이지 */}
        <Route path='/' element={ <Main/> } />
          
        {/* 회원가입페이지 */}
        <Route path='/joinForm' element={ <Join /> } />
        
        {/* 로그인페이지 */}
        <Route path='/loginForm' element={ <Login /> } />
      </Routes>

    </div>
  );
}

export default App;
