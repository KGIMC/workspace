import React from 'react'
import { Outlet } from 'react-router-dom';

const UserLayout = () => {
  return (
    <div>
      <div>유저 전용 페이지입니다.</div>
      <Outlet/>
    </div>
  )
}

export default UserLayout;