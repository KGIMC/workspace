
import React, { useEffect, useState } from 'react'
import './RegItem.css'
import axios from 'axios';

const RegItem = () => {
  //첨부파일을 저장할 state 변수
  const [mainImg, setMainImg] = useState(null);
  const [subImg, setSubImg] = useState(null);

  //카테고리 목록을 저장할 state 변수
  const [categoryList, setCategoryList] = useState([]);

  //상품 등록 시 가져갈 데이터를 저장할 state 변수
  const [insertItemData, setInsertItemData] = useState({
    itemName : '',
    itemPrice : '',
    itemIntro : '',
    cateCode : 1
  });

  //카테고리 목록 조회
  useEffect(() => {
    axios.get('/api_admin/getCateList')
    .then((res) => {
      setCategoryList(res.data);
    })
    .catch((error) => {console.log(error)});
  }, []);

  //INPUT태그에 값 입력 시 insertItemData 변수에 입력 값 저장 함수
  function changeInsertItemData(e){
    setInsertItemData({
      ...insertItemData,
      [e.target.name] : e.target.value
    });
  }

  //상품등록 버튼 클릭 !!
  //post(url, data, config)
  //get(url, config)
  //put(url, data, config)
  //delete(url, config)
  function insertItem(){
    //axios 통신으로 자바로 갈 때 첨부파일이 있으면
    //반드시 아래의 설정코드를 axios에 추가!!!!
    const fileConfig = {headers : {'Content-Type' : 'multipart/form-data'}};

    //위의 설정코드를 axios 통신할 때 추가하면 
    //자바로 넘어가는 데이터를 전달하는 방식이 달라짐
    //첨부파일이 있는 데이터를 자바로 전달하기 위해서는 form태그를 사용해서 전달!

    //1. form 객체 생성
    const itemForm = new FormData();

    //2. form 객체에 데이터 추가
    //itemForm.append('itemName', '상품1');
    //itemForm.append('itemPrice', 10000);

    itemForm.append('itemName', insertItemData.itemName);
    itemForm.append('itemPrice', insertItemData.itemPrice);
    itemForm.append('itemIntro', insertItemData.itemIntro);
    itemForm.append('cateCode', insertItemData.cateCode);
    itemForm.append('mainImg', mainImg);
    itemForm.append('subImg', subImg);

    //3. 데이터를 가진 form 객체를 axios 통신에서 자바로 전달한다.
    //axios.post('/api_admin/insertItem', insertItemData, fileConfig)
    axios.post('/api_admin/insertItem', itemForm, fileConfig)
    .then((res) => {
      alert('상품등록');
    })
    .catch((error) => {console.log(error);});
  }

  return (
    <div className='reg-item-div'>
      <div className='input-element'>
        <div>상품 카테고리</div>
        <div>
          <select className='form-control' 
                  name='cateCode' onChange={(e) => {changeInsertItemData(e)}}>
            {
              categoryList.map((category, i) => {
                return (
                  <option key={i} value={category.cateCode}>{category.cateName}</option>
                );
              })
            }
          </select>
        </div>
      </div>
      <div className='input-element'>
        <div>상품명</div>
        <div>
          <input type='text' className='form-control'
                  name='itemName' onChange={(e) => {changeInsertItemData(e)}}/>
        </div>
      </div>
      <div className='input-element'>
        <div>상품 가격</div>
        <div>
          <input type='text' className='form-control'
              name='itemPrice' onChange={(e) => {changeInsertItemData(e)}}/>
        </div>
      </div>
      <div className='input-element'>
        <div>상품 소개</div>
        <div>
          <textarea className='form-control' rows={7}
              name='itemIntro' onChange={(e) => {changeInsertItemData(e)}}></textarea>
        </div>
      </div>
      <div className='input-element'>
        <input type='file' onChange={(e) => {
          //선택한 파일 정보(배열 형태로 가져 옴)
          console.log(e.target.files[0]);
          setMainImg(e.target.files[0]);
        }}/>
      </div>
      <div className='input-element'>
        <input type='file' onChange={(e) => {
          setSubImg(e.target.files[0]);
        }}/>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary' 
              onClick={() => {insertItem()}}>상품등록</button>
      </div>
    </div>
  )
}

export default RegItem