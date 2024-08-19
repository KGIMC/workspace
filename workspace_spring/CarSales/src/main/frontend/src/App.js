import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Main from './pages/Main';
import Manage from './pages/Manage';

function App() {
  return (
    <div className="App">
    <Routes>
      {/* 메인 페이지 */}
      <Route path='/' element={<Main/>}/>

      {/* 관리 페이지 */}
      <Route path='/manage' element={<Manage/>}/>

      {/* 판매정보 화면 */}
      <Route/>
    </Routes>
    </div>
  );
}

export default App;
