import React from 'react'

const Manage = () => {
  return (
    <>
      <div className='main-div'>
        <div>홈</div>
        <div>차량관리</div>
        <div>판매정보등록</div>
        <div>판매목록</div>
      </div>
      <div>
        <div>차량등록</div>
        <div>
          제조사
          <select>
            <option>현대</option>
            <option>기아</option>
            <option>쌍용</option>
          </select>
          모델명
          <input type='text'/>
          가격
          <input type='text'/>
          <button type='button'>등록</button>
        </div>
        <div>차량목록</div>
        <div>
          
          <table>
            <thead>
              <tr>
                <td>제조사</td>
                <td>모델명</td>
                <td>차량가격</td>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>1</td>
                <td>2</td>
                <td>3</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </>
  )
}

export default Manage;