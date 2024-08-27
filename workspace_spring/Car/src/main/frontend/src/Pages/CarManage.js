import React, { useEffect, useState } from 'react'
import './CarManage.css';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const CarManage = () => {

  const navigate = useNavigate();

  // 차량 정보 저장할 state 변수
  const [carInfo, setCarInfo] = useState({
    modelName : '현대차',
    price : 0,
    brand : '현대'
  });

  // 등록된 차량 목록 저장할 state 변수
  const [carList, setCarList] = useState([]);

  // 등록 버튼 누르면 실행될 내용
  function insertCar(){
    axios.post('car/insert', carInfo)
    .then((res)=>{
    })
    .catch((error)=>{
      console.log(error)
    })
  }

  useEffect(()=>{
    axios.get('car/getCarList')
    .then((res)=>{
      setCarList(res.data);
    })
    .catch((error)=>{
      console.log(error)
    })
  }, []);


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
      <div><button type='button' onClick={()=>{insertCar()}} onChange={()=>{navigate('/carManage')}}>등록</button></div>
      <h4>- 차량 목록</h4>
      <div>
      <table className='car-manage-table'>
          <thead>
            <tr>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
          {
            carList.map((car, i)=>{
              return(
                <tr key={i}>
                  <td>{car.modelNum}</td>
                  <td>{car.modelName}</td>
                  <td>{car.price}</td>
                </tr>
              )
            })
          }
          </tbody>
      </table>
      </div>
    </div>
  )
}

export default CarManage;