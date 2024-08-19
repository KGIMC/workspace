import axios from "axios"

//아이디 중복 체크
export const checkId = (data) => {
  const response = axios.get(`/member/checkId/${data}`);
  return response;
}

//회원가입
export const join = (data) => {
  const response = axios.post('/member/join', data);
  return response;
}

//로그인
export const login = (data) => {
  const response = axios.post('/member/login', data);
  return response;
}