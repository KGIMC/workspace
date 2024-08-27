import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const SaleInfoInsert = () => {

  const navigate = useNavigate();

  // 등록된 구매자 정보 저장할 state 변수
  const [buyer, setBuyer] = useState({
    buyer : '', 
    buyerTel : '', 
    color : '블랙', 
    salesDate : '', 
    modelNum : 1
  });

  function changeInsert(e){
    setBuyer({
      ...buyer,
      [e.target.name] : e.target.value
    })
  }

  // 등록 버튼 누르면 실행될 내용
  function insertBuyer() {
    axios.post('sales/insert', buyer)
    .then((res)=>{
      console.log(res.data)
      setBuyer(res.data);
      navigate('/saleList')
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  return (
    <div className='main-div'>
        <table>
          <tbody>
          <tr>
            <td>구매자명</td>
            <td>
              <input type='text' name='buyer' 
              value={buyer.buyer} onChange={(e)=>{changeInsert(e)}}/>
            </td>
          </tr>
          <tr>
            <td>색상</td>
            <td>
              <select name='color' value={buyer.color} onChange={(e)=>{changeInsert(e)}}>
                <option value={'블랙'}>블랙</option>
                <option value={'레드'}>레드</option>
                <option value={'실버'}>실버</option>
                <option value={'화이트'}>화이트</option>
              </select>
            </td>
            <td>모델</td>
            <td>
              <select name='modelNum' value={buyer.modelNum} onChange={(e)=>{changeInsert(e)}}>
                <option value={1}>현대차</option>
                <option value={2}>기아차</option>
                <option value={3}>쌍용차</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>연락처</td>
            <td><input type='text' name='buyerTel' value={buyer.buyerTel} onChange={(e)=>{changeInsert(e)}} /></td>
          </tr>
          </tbody>
        </table>
        <div><button type='button' onClick={()=>{insertBuyer(
        )}}>등록</button></div>
    </div>
  )
}

export default SaleInfoInsert