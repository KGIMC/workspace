import React from 'react'
import { useNavigate } from 'react-router-dom'

const Header = () => {

  const navigate = useNavigate();

  return (
    <>
    <div className='header'>
        <h1>자 유 게 시 판</h1>
        <span onClick={()=>{navigate('/writeForm')}}>글좀쓰러가자</span>
    </div>
    
    </>
    
  )
}

export default Header
