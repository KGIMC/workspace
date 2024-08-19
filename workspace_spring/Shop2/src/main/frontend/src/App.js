import './App.css';
import './reset.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';

function App() {

  const navigate = useNavigate();

  return (
    <div className="container">
      <div className='login-div'>
        유저 및 관리자 공용 화면

          <div className='join-div'>
            <span>Login</span>
            <span onClick={()=>{navigate('/join')}}>Join</span>
          </div>
        
        </div>
      <div className='layout-div'>
        <Routes>

        {/* 유저 */}
        <Route path='/' element={<UserLayout />}>
        
          {/* 상품 목록 화면 */}
          <Route path='' element={<div>상품목록화면</div>}/> 

          <Route path='test1' element={<div>1번화면</div>}/>
          <Route path='test2' element={<div>2번화면</div>}/>

        </Route>
        
        {/* 관리자 */}
        <Route path='/admin' element={<AdminLayout/>}>
          <Route path='test1' element={<div>상품등록페이지</div>}/>
        </Route>

        {/* 회원가입 페이지 */}
        <Route path='/join' element={<Join/>}/>

        
        </Routes>
      </div>
    </div>
  );
}

export default App;
