import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Viewer from './Viewer';
import Controller from './Controller';

// 바뀌는 함수는 useState 이용해서 만들기
// 그래야 재랜더링 해서 화면에 출력됨.

// 데이터 전달은 부모 -> 자식간에만 전달 가능
// App이라는 부모에서 Viewer라는 자식에게 전달 가능
// Viewer라는 자식에서 Controller라는 자식에게 전달 불가능
// 서로 전달 가능하려면 통합 부모인 App에 명령어를 생성해둬야 데이터 전달이 용이함

function App() {

  let [count, setCount] = useState(0);
  // useState(0) = 0에 든 값이 초기값

  // count = 10;
  // 값은 바뀌지만, 재랜더링 해주지 않음.
  // setCount(10);
  // setCount라는 함수를 이용해서 값을 변경할때만 재랜더링 됨.

  function changeCount(num) {
    // setCount();
    // console.log(num)
    const result = count + Number(num);
    console.log(result);

    setCount(result);
  }

  return (
    <div className="App">
      <h2>Simple Counter</h2>
      <Viewer count={count}/>
      {/* Viewer에 count값 전달 */}
      <Controller changeCount={changeCount} />
    </div>
  );
}



export default App;

