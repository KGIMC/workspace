import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';

function App() {
  let item_list = data;

  return (
    <div className="App">
      <div className='header'>
      Book Shop
      <Link to={'/list'}>상품 목록</Link>
      <Link to={'/detail'}>상품 상세</Link>
      </div>
        <div className='banner'>
        <img src={process.env.PUBLIC_URL + '/header.jpg'} />
      </div>  

    {/* 이동할 수 있는 페이지의 url들 */}
      <Routes>
        <Route path='/' element={<div>메인페이지</div>}/>
        <Route path='/list' element={<ItemList item_list={item_list}/>} />
        <Route path='/detail/:id' element={<Detail item_list={item_list}/>}/>
        {/* detail/:id - id라는 이름으로 데이터 전달 */}
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />
      </Routes>

     {/* <ItemList item_list={item_list}/> */}
  </div>
  );
}
                
const Test = ({name, age}) => { 
  return(
    <div>123</div>
  );
};

export default App;
