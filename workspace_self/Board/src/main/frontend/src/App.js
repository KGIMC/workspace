import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import WriteForm from './pages/WriteForm';
import Header from './Header';

function App() {

  const navigate = useNavigate();

  return (
    <div className="App">
      {/* 헤더 관리 부분 */}
      <Header/>
            
      <Routes>
        <Route path='/writeForm' element={<WriteForm/>}/>
      </Routes>
      
    </div>
  );
}

export default App;
