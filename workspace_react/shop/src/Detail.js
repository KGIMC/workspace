
import { useParams } from 'react-router-dom';
import './Detail.css'
import { useEffect, useState } from 'react';


function Detail({item_list}){
  
  // param은 변수
  // url로 전달되는 데이터 받기
  // 1번 방식
  // const params = useParams();
  // console.log(params);
  // console.log(params.id);

  const {id} = useParams(); 
  // console.log(`전달된 상품 번호 : ${id}`)

  // console.log(item_list);

  let findItem = null;

  item_list.forEach((item, i) => {
    if(item.itemNum == id){
      // 가져온 상품번호가 가져온 id와 똑같은지 비교
        findItem = item;
        
    }
  });

  // useEffect가 필수로 쓰일 때 - DB연결해서 사용할때
  // useEffect에 같이 사용되는 것들
  
  // mount, update, unmount
  // mount(생성), update(변화), unmount(사망)
  // mount : 최초에 컴포넌트가 생성됨
  // update : 컴포넌트가 재랜더링 되는 상태 
  // unmonut : 컴포넌트가 사라졌을 때

  const [num, setNum] = useState(0);
  const [num1, setNum1] = useState(0);
  const [num2, setNum2] = useState(0);

  // 해당 컴포넌트가 랜더링되면 항상 마지막에 실행
  // mount(컴포넌트를 새로 읽을 때) + update(재랜더링) 될때 실행
  // useEffect의 두번째 매개변수가 없으면 mount + update 될때 실행

  useEffect(()=>{
    console.log(1);
  }, []);  

  // mount(컴포넌트를 새로 읽을 때) 될 때 실행
  // 두번째 매개변수로 빈 배열을 전달하면 mount 될때만 실행
  useEffect(()=>{
    console.log(2);
  }, []); 

  // 두번째 매개변수에 배열형태로 state 변수를 넣으면
  // 해당 usetEffect mount + 배열에 넣은 state값이 변경되어 재랜더링 될때 실행    
  useEffect(()=>{
    console.log(3);
  }, []);

  // 
  useEffect(()=>{
    console.log(4);
  }, []); 

  // return 안의 내용은 mount 될때 실행 안됨.
  // update 될때 실행되는데 가장 먼저 실행함.
  // unmount 될때도 실행함.

  useEffect(()=>{
    console.log(5);

    return () => {
      console.log(6);
    }

  }, [num, num1]);

    // unmount 될때만 7 출력
    useEffect(()=>{
      return () => {
        console.log(7);
      }
    }, []);

  return(
    <>
      <button type='button' onClick={(e)=>{
        setNum(num+1);
      }}> num값 변경 </button>
      <div>num = {num}</div>

      <button type='button' onClick={(e)=>{
        setNum1(num1+1);
      }}> num1값 변경 </button>
      <div>num1 = {num1}</div>

      <button type='button' onClick={(e)=>{
        setNum2(num2+1);
      }}> num2값 변경 </button>
      <div>num2 = {num2}</div>


      <div className="item-info">
        <img src={process.env.PUBLIC_URL + '/' + findItem.imgName} />
        <div>
          <h4>{findItem.itemName}</h4> 
          <p>{findItem.price}</p>
          <button type='button'>주문하기</button>
        </div>  
      </div>  
      <div className='intro'>
        상품 소개입니다.
      </div>  
    </>
  );
}

export default Detail;