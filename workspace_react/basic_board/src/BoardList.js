
import { Link, useNavigate } from 'react-router-dom';
import './BoardList.css'


// 게시글 목록 컴포넌트
const BoardList = ({board_list}) => {

  const navigate = useNavigate();

  return(
    <>
    <table>
      <thead>
        <tr>
          <td>글번호</td>
          <td>글제목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
      </thead>
      
      <tbody>
        {/* 데이터를 넣어줘야할 공간, 리턴값이 있기에 map 사용 */}
        {
          board_list.map((board, i) => {
            return(
              <tr key={i}>
                <td>{board.boardNum}</td>
                {/* 제목 클릭하면 상세보기 페이지로 이동 */}
                <td>
                  {/* <Link to="/detail"> */}{/* </Link> */}
                  <span onClick={(e) => {
                    navigate(`/detail/${board.boardNum}`);
                  }}>{board.title}</span>
                </td>
                <td>{board.writer}</td>
                <td>{board.createDate}</td>
              </tr>
            );
          })
        }
      </tbody>
    </table>
    <button tpye="button" onClick={(e) => {navigate('/writerForm')}}>글쓰기</button>
        
    </>
  );
}

export default BoardList;