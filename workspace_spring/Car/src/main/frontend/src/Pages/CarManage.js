import React, { useEffect, useState } from 'react'
import './CarManage.css';
import axios from 'axios';

const CarManage = () => {

  const [carInfo, setCarInfo] = useState({
    modelName : '',
    price : 0,
    brand : '현대'
  });


  function insertCar(){
    axios.post('car/insert', carInfo)
    .then((res)=>{
      console.log(res.data)
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  function changeInsert(e){
    setCarInfo({
      ...carInfo,
      [e.target.name] : e.target.value
    })
  }

  return (
    <div className='main-div'>
      <h4>- 차량 등록</h4>
      <div className='car-div'>
        <span>제조사</span>
          <span>
            <select name='brand' onChange={(e)=>{changeInsert(e)}}>
              <option value={'현대'}>현대</option>
              <option value={'기아'}>기아</option>
              <option value={'쌍용'}>쌍용</option>
            </select>
          </span>
        <span>모델명</span>
          <span>
            <input type='text' name='modelName' onChange={(e)=>{changeInsert(e)}}/>
          </span>
        <span>차랑가격</span>
          <span>
            <input type='text' name='price' onChange={(e)=>{changeInsert(e)}}/>
          </span>
      </div>
      <div><button type='button' onClick={(e)=>{insertCar()}}>등록</button></div>
      <h4>- 차량 목록</h4>
      <div>
        
      </div>
    </div>
  )
}

export default CarManage;