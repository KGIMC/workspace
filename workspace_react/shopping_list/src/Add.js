import { useState } from "react";

function Add(props){

  let [text, setText] = useState('');

  return(
    <div className='box'>
          <input type="text" onChange={(e)=>{
            // console.log(e.target.value);
            setText(e.target.value);
            // e.target.value -> 키보드에 입력한 값
            // setText -> e.target.value에서 받은 값을 저장
          }}></input>
          {/* onChange -> 값이 바뀔때마다 알아서 실행
          ex) input 태그 안의 내용이 바뀔때마다 실행한다는 소리 */}
          <button type="button" onClick={(e)=>{
            // input 태그에 입력한 내용 가져오기
            props.list.push(text);
            console.log(props.list);
            // 값 추가되는거 확인하는 console
            // 가져온 내용 list에 추가
            props.setList([...props.list]);
            // 변경된 list 내용으로 setList 함수로 호출
          }}>추가</button>

          
    </div>
  );
}

export default Add;