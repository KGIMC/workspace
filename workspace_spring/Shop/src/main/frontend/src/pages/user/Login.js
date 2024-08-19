
import React, { useState } from 'react'
import './Login.css'
import Modal from '../../common/Modal';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const Login = ({setLoginInfo, loginInfo}) => {
  const navigate = useNavigate();

  //LOGIN버튼 클릭 시 화면에 보여지는 모달창의 상태
  const [beforeLoginModal, setBeforeLoginModal] = useState(false);

  //login 쿼리가 실행된 후 보여지는 모달창의 상태
  const [afterLoginModal, setAfterLoginModal] = useState(false);

  //로그인 성공 실패 여부를 저장하는 변수
  const [isLoginSuccess, setIsLoginSuccess] = useState(false);

  //입력한 id, pw를 저장할 변수
  const [loginData, setLoginData] = useState({
    memId : '',
    memPw : ''
  });

  //입력한 id, pw를 loginData에 저장하는 함수(입력할 때마다 실행)
  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    });
  }

  //login 버튼 클릭 시 실행
  function login(){
    //id,pw 입력 여부 확인
    if(loginData.memId == '' || loginData.memPw == ''){
      //모달창상태를 보이게 변경
      setBeforeLoginModal(true);
      return ;
    }

    axios.post('/api_member/login', loginData)
    .then((res) => {
      setAfterLoginModal(true);

      //자바에서  null 데이터가 전달되면 res.data는 빈문자('')데이터로 변환하다.
      if(res.data == ''){ //로그인 실패시..
        setIsLoginSuccess(false);
      }
      else{ //로그인 성공 시
        setIsLoginSuccess(true);

        //로그인 정보
        const loginInfo ={
          memId : res.data.memId,
          memName : res.data.memName,
          memRole : res.data.memRole
        };

        //로그인 정보를 가진 객체를 문자열 형태로 변환
        //객체 -> 문자열로 변환한 데이터를 JSON 데이터로 부른다.
        const json_loginInfo = JSON.stringify(loginInfo);

        //sessionStoragy에 로그인한 회원의 아이디, 이름, 권한정보 등록
        window.sessionStorage.setItem('loginInfo', json_loginInfo);

        //로그인 정보를 저장하기 위해 만든 state 변수 loginInfo(App.js에 생성)에
        //로그인 정보를 저장
        setLoginInfo(loginInfo);
      }
    })
    .catch((error) => {console.log(error);});
  }

  //login 쿼리 실행 후 띄는 모달 안의 내용
  function drawModalContent(){
    return (
      <>
        {
          isLoginSuccess
          ?
          <div>환영합니다.</div>
          :
          <div>ID, PW를 확인하세요~</div>
        }
      </>
    );
  }

  //login 쿼리 실행 후 띄는 모달 안의 확인 버튼 클릭 시 실행되는 내용
  function handleBtn(){
    if(isLoginSuccess){ //로그인 성공 시 확인 버튼 내용
      //일반유저면 -> 상품목록페이지
      //관리자면 -> 상품등록페이지
      if(loginInfo.memRole == 'USER'){
        navigate('/')
      }
      else if(loginInfo.memRole == 'ADMIN'){
        navigate('/admin/itemManage')
      }
    }
  }
 
  return (
    <div className='login-page-div'>
      <div>
        <input type='text' className='form-control' placeholder='Input your ID'
             name='memId' onChange={(e) => {changeLoginData(e)}}/>
      </div>
      <div>
      <input type='password'className='form-control' placeholder='Input your Password'
        name='memPw' onChange={(e) => {changeLoginData(e)}}/>
      </div>
      <div>
        <button className='btn btn-primary wide' onClick={(e) => {login()}}>L O G I N</button>
      </div>

      {/* login 중 id, pw 입력 여부 확인 모달창 */}
      {
        beforeLoginModal
        ?
        <Modal content={() => {
                          return (
                            <div>ID, PW는 필수입력입니다.</div>
                          );
                        }} 
                setIsShow={setBeforeLoginModal}
                clickCloseBtn={() => {}}/>
        :
        null
      }

      {/* login 쿼리 실행 후 띄는 모달 */}
      {
        afterLoginModal
        ?
        <Modal content={drawModalContent}
              setIsShow={setAfterLoginModal}
              clickCloseBtn={handleBtn}/>
        :
        null
      }

    </div>
  )
}

export default Login