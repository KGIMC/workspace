import React, { useState } from 'react'
import { useLocation } from 'react-router-dom';

const SaleList = () => {

  

  return (
    <div className='main-div'>
      <div>
        <table>
          <thead>
          <tr>
            <td rowSpan={2}>No</td>
            <td colSpan={4}>구매자정보</td>
            <td colSpan={3}>차량정보</td>
          </tr>
          <tr>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>금액</td>
          </tr>
          </thead>
          <tbody>
            
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default SaleList