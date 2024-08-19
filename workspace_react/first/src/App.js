import logo from './logo.svg';
import './App.css';

function App() {
  return (
    // 아래의 구문들을 jsx라고 부름.
    // html이 아님. (절대 아님)
    // html처럼 쓸 수 있게 만들어놓은 것 뿐
    // 사용하는 기능은 javascript와 비슷하다고 생각하고 작성하기
    <div className="App">
        <MyTable></MyTable>
    </div>
  );
}

function MyTable(){
  return(
    // 자주 쓰는 디자인, 함수, 코드 등을 만들어놓고
    // 위에서 불러다가 쓰기 위함.
    // 더 편리하게 쓰기 위한 용도.
    // 이렇게 만들어진 함수들을 컴포넌트라고 부름.
    <table border="1">
        <tr>
          <td>이름</td>
          <td>나이</td>
        </tr>
    </table>
  );
}

export default App;
