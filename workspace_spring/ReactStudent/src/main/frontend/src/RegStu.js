import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const RegStu = () => {

  const navigate = useNavigate();
  const [stuInfo, setStuInfo] = useState({
    stuName : '',
    stuAge : '',
    stuTel : '',
    stuAddr : ''
  });

  function chaneStuInfo(e){
    setStuInfo({
      ...stuInfo,
      [e.target.name] : e.target.value
    });
  }

  function regStudent(){
    // 이름 입력했는지 확인
    const nameInputTag = document.querySelector('input[name="stuName"]');
    if(nameInputTag.value == ''){
      alert("이릅은 필수 입력입니다.")
      nameInputTag.focus();
      return ;
    }


    axios
    .post('/insertStudent', stuInfo)
    .then((res)=>{
      alert("학생 등록 완료");
      navigate('/');
    })
    .catch((error)=>{
      alert("오류")
      console.log(error);
    })
      
  }

  return (
    <div className="divInput">
      이 름 <input name="stuName" onChange={(e)=>{chaneStuInfo(e)}} /> <br/>
      나 이 <input name="stuAge" onChange={(e)=>{chaneStuInfo(e)}} /> <br/>
      전 화 <input name="stuTel" onChange={(e)=>{chaneStuInfo(e)}} /> <br/>
      주 소 <input name="stuAddr" onChange={(e)=>{chaneStuInfo(e)}} /> <br/>
      <button type="button" onClick={(e)=>{regStudent()}}>학생 등록</button>
    </div>
  );
}

export default RegStu;