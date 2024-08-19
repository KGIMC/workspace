import axios from "axios";
import { useEffect, useState } from "react";
import './StudentList.css';
import DelStu from "./DelStu";
import { useNavigate } from "react-router-dom";
import { getStuList } from "./apis";



const StudentList = () => { 

  // 학생 목록을 저장할 state 변수
  const [stuList, setStuList] = useState([]);

  const navigate = useNavigate();
  
  useEffect(()=>{
    // axios
    // .get('/getStuList')
    getStuList()
    .then((res)=>{
      console.log("성공")
      console.log(res);
      setStuList(res.data);
    })
    .catch((error)=>{
      console.log("오류")
    })
  },[]);

  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생명</td>
            <td>국어점수</td>
            <td>영어점수</td>
            <td>수학점수</td>
            <td>평균</td>
          </tr>
        </thead>
        <tbody>
          {/* 조회된 데이터가 있는 경우 반복문
          조회된 데이터가 없는 경우 반복문 x
          삼항연산자 사용 */}
          {
            stuList.length == 0 ?
            <tr>
              <td colSpan='6'>조회된 데이터가 없습니다.</td>
            </tr> 
            :
            stuList.map((stu, i)=>{
              return(
                <tr key={i}>
                {/* <td>{stuList.length - i}</td> */}
                <td>{stuList.length - i}</td>
                <td>
                  <span onClick={()=>{
                    navigate(`/StuDetail/${stu.stuNum}`)
                  }}>{stu.stuName}</span>
                  </td>
                <td>{stu.korScore}</td>
                <td>{stu.engScore}</td>
                <td>{stu.mathScore}</td>
                <td>{Math.round((stu.korScore + stu.engScore + stu.mathScore)/3 * 100)/100}</td>
              </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
}

export default StudentList;