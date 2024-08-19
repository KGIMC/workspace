import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import { getStuDetail } from './apis';

const StuDetail = () => {

  const navigate = useNavigate();
  const {stuNum} = useParams();
  const [stuInfo, setStuInfo] = useState({});

  useEffect(()=>{
    // axios
    // .get(`/getStuDetail/${stuNum}`)
    getStuDetail(stuNum)
    .then((res)=>{
      console.log("성공")
      setStuInfo(res.data);
    })
    .catch((error)=>{
      alert("상세보기 오류")
      console.log(error)
    })
  }, []);

  const avg = Math.round((stuInfo.korScore + stuInfo.engScore + stuInfo.mathScore)/3 * 100)/100;

  return (
    <div>
      <div>이름 : {stuInfo.stuName}</div>
      <div>나이 : {stuInfo.stuAge}</div>
      <div>연락처 : {stuInfo.stuTel}</div>
      <div>주소 : {stuInfo.stuAddr}</div>
      <div>국어 : {stuInfo.korScore}</div>
      <div>영어 : {stuInfo.engScore}</div>
      <div>수학 : {stuInfo.mathScore}</div>
      <div>평균 : {avg}</div>
      <button type="button" onClick={()=>{navigate(-1)}}>뒤로가기</button>
    </div>
  )
}

export default StuDetail;