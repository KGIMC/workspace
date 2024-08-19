import axios from "axios";
import BoardList from "./BoardList";

const AxiosTest = () => {

// spring 서버와 데이터 통신을 위해 react 에서는 axios 기술 사용
// 순서
// axios 설치 : npm install axios

// axios는 데이터베이스의 작업 종류에 따라 함수를 제공
// get(url [, config]) : 데이터 조회(SELECT)
// post(url, data [, config]) : 데이터 삽입(INSERT)
// put(url, data [, config]) : 데이터 수정(UPDATE)
// delete(url, [, config]) : 데이터 삭제(DELETE)
// 사용 예제
// axios
// .get()
// .then(데이터 통신 성공 후 실행 내용)
// .catch(데이터 통신 중 오류 발생 시 실행 내용);

// 쿼리에 빈값이 데이터 조회 1
function get1(){
  axios
  .get('/getList')
  .then((res)=>{
    console.log(res.data);
  })
  .catch((error)=>{
    console.log("axios 통신 중 오류 발생");
    console.log(error)
  });
}

function get2(){
  axios
  .get('/detail/1')
  .then((res) => {
    console.log("조회 성공")
  })
  .catch((error) => {
    console.log("axios 통신 중 오류 발생")
    console.log(error)
  })
}


function postTest(){

  const member = {
    name : 'kim',
    age : 20
  };

  axios
  // .post('/insertBoard', {name:'kim', age:20}) 
  .post('/insertBoard', member )
  // './' -> 해당 페이지로 간다는 의미이기에 java에서 같은 이름으로 작성해주면 됨. ( Controller에 )
  // Post를 쓰기에 java도 postmapping
  // 객체로 데이터 가져감.
  // 보낼 데이터는 따로 변수 선언해서 보내도 됨.
  .then((res) => {
    console.log(res.config.data)
  })
  .catch((error) => {
    console.log("axios 통신 중 오류 발생")
  })
}

function putTest(){
  axios
  .put('/updateBoard', {
    boardNum : 1,
    boardTitle : 'JAVA',
    boardWriter : '홍길동'
  })
  .then((res) => {
    alert('내용을 수정했습니다.')
    alert(res.data)
  })
  .catch((error) => {
    console.log("axios 통신 중 오류 발생")
  })
}

return(
    <div>
        <h2>axios 통신 연습</h2>
        
        <div>
          <button className="btn-div" type='button' onClick={() => {get1()}}>get으로 버튼 조회하기 1</button>
        </div>

        <div>
          <button className="btn-div" type='button' onClick={() => {get2()}}>get으로 버튼 조회하기 2</button>
        </div>

        <div>
          <button className="btn-div" type='button' onClick={() => {postTest()}}>post로 데이터 전달하기</button>
        </div>

        <div>
          <button className="btn-div" type='button' onClick={() => {putTest()}}>put으로 데이터 전달하기</button>
        </div>

    </div>
    
  );
}

export default AxiosTest;
