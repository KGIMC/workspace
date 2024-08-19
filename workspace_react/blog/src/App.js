import logo from './logo.svg';
import './App.css';
import { useState } from 'react';



// app() 함수의 리턴문 안에 작성하는 코드가 화면에 나타남
// html 코드처럼 보이는 것은 jsx 라는 문법임
// 그렇기 때문에 html과 조금 다른 부분이 있다.
function App() {
  
  // const titles = ['울산 맛집', '리액트 공부', '집에 갈랭'];
  
  // 제목 정보를 저장하고 있는 변수
  const [titles, setTitles] = useState(['울산 맛집', '리액트 공부', '집에 갈랭']);

  // [] 첫번째 : 변수(변수의 초기값)
  // 해석 : useState(값이) [] 안의 첫번째 변수에 값이 들어가있다.
  // [] 두번째 : 변수의 값을 변경시켜주는 함수
  // ex> setLikeCnt(5); -> likeCnt 변수의 값을 5로 변경
  // useState로 만들어진 변수는 값을 변경하면 html 화면을 재랜더링한다.
  let [likeCnt, setLikeCnt] = useState(0);
  let [likeCnt2, setLikeCnt2] = useState(0);
  let [likeCnt3, setLikeCnt3] = useState(0);

  // 배열로 만드는 방법
  // let [likeCnt, setLikeCnt] = useState([0, 0, 0])

  // detail 컴포넌트가 보일지 안보일지 결정하는 변수
  let [isShow, setIsShow] = useState(false);
  
  // name에 java값이 들어가있음.
  let [name, setName] = useState('java');
  // arr에 1,2,3이 들어가있음.
  let [arr, setArr] = useState(1, 2, 3);

  function test(){
    alert(23);
  }





  return ( // 리턴 문 안에 들어가는 문법은 jsx, jsx 안에서는 if문 사용 불가
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div>

     
      <button type="button" onClick={() => {
        const copyTitles = [...titles];
        copyTitles[0] = '대구 맛집';
        setTitles(copyTitles);

        copyTitles[1] = '부산 맛집';
        setTitles(copyTitles);

        copyTitles[2] = '서울 맛집';
        setTitles(copyTitles);
      }}>제목변경</button>

        {/* 블로그 글 목록 */}
        { 

          titles.map((title, i)=>{
            return (
              <Board title={title} key={i}/>
            );
          })
        }

        {/* 상세보기 */}
         {
         isShow ? <Detail/> : null
         // 해석 -> isShow 변수값이 트루면 Detail 실행
         // true가 아니면 null
         // : 들어가면 안됨.
         } 
    </div>
  );
}

// 상세보기 컴포넌트 - 앞글자 대문자
// 컴포넌트의 리턴문 안에 html 작성
// 모든 html 태그는 하나의 최상위 태그에 포함되게 작성
function Detail(){
  <div className='detail'>
          <h4>제목</h4>
          <p>날짜</p>
          <p>상세내용</p>
  </div>
}

// 블로그 글 하나에 대한 컴포넌트
function Board(props){
  return(
    <div className="list">
      <h4>
      {props.title}
      <span>👍</span>
       0
      </h4>
      <p>2024-07-04</p>
    </div>
  );
}


export default App;
