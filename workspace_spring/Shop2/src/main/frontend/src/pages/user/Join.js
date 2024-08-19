import React from 'react'

const Join = () => {
  return (
    <div>
      회원가입 페이지


      <div className='join-form'>
        <div>
            아이디  <input type='text'/> 
                    <button type='button'>중복확인</button>
        </div>
        <div>
          비밀번호 <input type='password' />
        </div>
        <div>
          비밀번호 확인 <input type='password' />
        </div>
        <div>
          이름 <input type='text'/>
        </div>
        <div>
          연락처 <input type='text'/>
        </div>
        <div>
          주소 <input type='text'/> 
                <button type='button'>검색</button><br/>
                <input type='text'/> <br/>
                <input type='text'/>
        </div>
        <div>
          이메일 <input type='text'/>
                  <select>
                    <option>naver.com</option>  
                    <option>gmail.com</option>  
                  </select>     
        </div>
      </div>  

    </div>
    
  )
}

export default Join;