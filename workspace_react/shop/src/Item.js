import { useNavigate } from "react-router-dom";

const Item = ({item}) => {

  // navigate는 함수
  // 변수는 navigate;
  // 함수는 navigate('이동할 url 입력하면 해당 url로 이동');
  // 함수는 navigate('-1'); <- 이전 페이지 가기
  // 함수는 navigate('-2'); <- 이전 페이지 가기
  // 함수는 navigate('1'); <- 다음 페이지 가기
  
  const navigate = useNavigate();

  return(
    <div className='item' >
    <img onClick={(e) => {
      navigate(`/detail/${item.itemNum}`);
    }}
    src={process.env.PUBLIC_URL + '/' + item.imgName} />
    <h3>{item.itemName}</h3>
    <p>{item.price}</p>
  </div>
  );
}

export default Item;