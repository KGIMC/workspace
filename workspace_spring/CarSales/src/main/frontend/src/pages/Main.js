import React from 'react'
import { useNavigate } from 'react-router-dom';

const Main = () => {

  const navigate = useNavigate();

  return (
      <>
      <div className='main-div'>
        <div>홈</div>
        <div onClick={(e)=>{ navigate('/manage') }}>차량관리</div>
        <div>판매정보등록</div>
        <div>판매목록</div>
      </div>
      <div className='sub-div'>
        차량 관리 시스템
      </div>
      </>
  )
};

export default Main;