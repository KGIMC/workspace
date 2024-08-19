import axios from "axios";
import { useEffect, useState } from "react";
import RegScore from "./RegScore";
import { useNavigate } from "react-router-dom";
import { getStuList } from "./apis";

const Score = () => {

  const [stuList, setStuList] = useState([]);
  const navigate = useNavigate();
  
  useEffect(()=>{
    // axios
    // .get('/getStuList')
    getStuList()
    .then((res)=>{
      setStuList(res.data);
    })
    .catch((error)=>{
    });
  }, []);

  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생명</td>
            <td>성적입력</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu, i)=>{
              return(
                <tr key={i}>
                  <td>{stuList.length - i}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" onClick={(e)=>{
                    navigate(`/regScore/${stu.stuNum}`)
                  }}>입력</button></td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
}

export default Score;
