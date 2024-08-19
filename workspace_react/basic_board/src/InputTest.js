import { useState } from "react";

const InputTest = () => {

  // 데이터를 받아오기 위해 빈값 설정
  let [inputData, setInputData]= useState('');
  let [inputData2, setInputData2]= useState('');
  
  const [stu, setStu] = useState({
    stuName : '',
    age : 0,
    score : '0',
    addr : ''
  });

  function changeStu(e){
    setStu({
      ...stu,
      // key값은 변수로 쓰려면 [] 안에 감싸야함.
      [e.target.name] : e.target.value
    });
  }

  return(
    <>
    <div>
        {/* onChange -> input 태그의 값이 바뀌었을때 무언가 실행하겠다는 의미 */}
        이  름 <input tpye='text' onChange={(e) => {
          setInputData(e.target.value);
        }}/> <br/>
        나  이 <input type='text' onChange={(e) => {
          setInputData2(e.target.value);
        }}/>
      </div>

      <div>
        이  름 <input type='text' name='stuName' onChange={(e) => {
          changeStu(e);
        }}/> <br/>
        나  이 <input type='text' name='age' onChange={(e) => {
          changeStu(e); 
        }}/> <br/>
        점  수 <input type='text' name='score' onChange={(e) => {
          changeStu(e);
        }} /> <br/>
        주  소 <input type='text' name='addr' onChange={(e) => {
          changeStu(e);
        }}/> <br/>

        <div>
          이  름 : {stu.stuName} <br/>
          나  이 : {stu.age} <br/>
          점  수 : {stu.score} <br/>
          주  소 : {stu.addr} <br/>
        </div>
      </div>
    </>
    
  );
}

export default InputTest;