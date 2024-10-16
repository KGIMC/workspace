import React from 'react'

const WriteForm = () => {
  
  return (
    <>
    <div className="form-container">
      <table>
        <tbody>
          <tr>
            <td>글번호</td>
            <td><input type="text" /></td>
          </tr>
          <tr>
            <td>글제목</td>
            <td><input type="text" /></td>
          </tr>
          <tr>
            <td>글내용</td>
            <td><textarea rows="4" /></td>
          </tr>
          <tr>
            <td>작성자</td>
            <td><input type="text" /></td>
          </tr>
          <tr>
            <td>작성일</td>
            <td><input type="date" /></td>
          </tr>
        </tbody>
      </table>
      
      
    </div>
    <button type='button'>등록</button>
    </>
  )
}

export default WriteForm