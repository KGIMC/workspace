import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import StudentList from './StudentList';
import RegStu from './RegStu';
import DelStu from './DelStu';
import Score from './Score';
import StuDetail from './StuDetail';
import RegScore from './RegScore';


function App() {
  const navigate = useNavigate();


  

  return (
    <div className="container">
      {/* 헤더 영역 */}
      <div className='header'>
        <ul>
          <li><span onClick={() => {navigate('/')}}>학생정보조회</span></li>
          <li><span onClick={() => {navigate('/regStu')}}>학생등록</span></li>
          <li><span onClick={() => {navigate('/delStu') }}>학생삭제</span></li>
          <li><span onClick={() => {navigate('/score')}}>성적관리</span></li>
        </ul>
      </div>

      {/* 컨텐츠 영역 */}
      <div className='content'>
        <Routes>

          {/* 학생정보조회 페이지 */}
          <Route path='/' element={ <StudentList /> } />

          {/* 학생상세정보 페이지 */}
          <Route path='/stuDetail/:stuNum' element={ <StuDetail />} />

          {/* 학생 등록 페이지 */}
          <Route path='/regStu' element={ <RegStu /> }/>

          {/* 학생 삭제 페이지 */}
          <Route path='/delStu' element={ <DelStu /> }/>
          
          {/* 성적 관리 페이지 */}
          <Route path='/score' element={ <Score /> }/>

          {/* 성적 등록 페이지 */}
          <Route path='/regScore/:stuNum' element={ <RegScore />}/>


        </Routes>
      </div>
    </div>
  );
}

export default App;
