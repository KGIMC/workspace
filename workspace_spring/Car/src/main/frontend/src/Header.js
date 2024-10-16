import React from "react";
import { useNavigate } from "react-router-dom";

function Header(){
  
  const navigate = useNavigate();

  return(
    <>
    <div className='header'>
        
          <span onClick={()=>{navigate('/home')}}>홈</span>
          <span onClick={()=>{navigate('/carManage')}}>차량관리</span>
          <span onClick={()=>{navigate('/saleInfoInsert')}}>판매 정보 등록</span>
          <span onClick={()=>{navigate('/saleList')}}>판매 목록</span>
        
    </div>
    </>
  );
}

export default Header;