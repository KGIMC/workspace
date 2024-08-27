import logo from './logo.svg';
import './App.css';
import Header from './Header';
import { Route, Routes } from 'react-router-dom';
import CarManage from './Pages/CarManage';
import Home from './Pages/Home';
import SaleInfoInsert from './Pages/SaleInfoInsert';
import SaleList from './Pages/SaleList';

function App() {

  return (
    <div className="App">
      {/* 헤더 관리 부분 */}
      <Header/>

      <Routes>
        {/* 홈 페이지 */}
        <Route path='/home' element={<Home/>}/>

        {/* 차량관리 페이지 */}
        <Route path='/carManage' element={<CarManage/>}/>
          
        {/* 판매 정보 등록 페이지 */}
        <Route path='/saleInfoInsert' element={<SaleInfoInsert />}/>

        {/* 판매 목록 페이지 */}
        <Route path='/saleList' element={<SaleList/>}/>

      </Routes>
    </div>
  );
}

export default App;
