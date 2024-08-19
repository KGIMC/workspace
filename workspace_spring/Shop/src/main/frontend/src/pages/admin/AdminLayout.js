
import React, { useState } from 'react'
import { Outlet, useNavigate } from 'react-router-dom'

const AdminLayout = () => {
  const navigate = useNavigate();

  //사이드메뉴 정보를 관리하는 state변수
  const [sideMenu, setSideMenu] = useState('itemManage');

  //사이드메뉴를 화면에 그리는 함수
  function drawSideMenu(){
    //상단 메뉴에서 상품관리 클릭 시
    if(sideMenu == 'itemManage'){
      return (
        <>
          <li>
            <span onClick={() => {navigate('/admin/itemManage')}}>상품관리</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
          <li>
            <span onClick={() => {navigate('/admin/regItem')}}>상품등록</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
          <li>
            <span onClick={() => {navigate('/admin/categoryManage')}}>카테고리관리</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
        </>
      );
    }
    //상단 메뉴에서 구매관리 클릭 시
    else if(sideMenu == 'saleManage'){
      return (
        <>
          <li>
              <span>이달의 구매내역</span>
              <span><i className="bi bi-chevron-right"></i></span>
            </li>
            <li>
              <span>구매정보 검색</span>
              <span><i className="bi bi-chevron-right"></i></span>
            </li>
        </>
      );
    }
    //상단 메뉴에서 유저관리 클릭 시
    else if(sideMenu == 'userManage'){
      return (
        <>
        <li>
            <span>유저검색</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
          <li>
            <span>유저정보 변경</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
          <li>
            <span>탈퇴유저 관리</span>
            <span><i className="bi bi-chevron-right"></i></span>
          </li>
      </>
      );
    }
    //상단 메뉴에서 매출관리 클릭 시
    else if(sideMenu == 'recordManage'){
      return (
        <>
          <li>
              <span>이달의 매출</span>
              <span><i className="bi bi-chevron-right"></i></span>
            </li>
            <li>
              <span>월별 매출</span>
              <span><i className="bi bi-chevron-right"></i></span>
            </li>
            <li>
              <span>카테고리별 매출</span>
              <span><i className="bi bi-chevron-right"></i></span>
            </li>
        </>
      );
    }
  }

  return (
    <div>
      <div className='menu-div'>
        <ul className='menu-ul'>
          <li><span onClick={() => {
            setSideMenu('itemManage')
            navigate('/admin/itemManage')
          }}>상품관리</span></li>
          <li><span onClick={() => {
            setSideMenu('saleManage')
            navigate('/admin/saleHistoryOfMonth')
          }}>구매관리</span></li>
          <li><span onClick={() => {
            setSideMenu('userManage')
            navigate('/admin/searchUser')
          }}>유저관리</span></li>
          <li><span onClick={() => {
            setSideMenu('recordManage')
            navigate('/admin/recordOfMonth')
          }}>매출관리</span></li>
        </ul>
      </div>
      <div className='side-menu-div'>
        <ul className='side-menu-ul'>
          {
            drawSideMenu()
          }
        </ul>
        <Outlet />
      </div>
    </div>
  )
}

export default AdminLayout
