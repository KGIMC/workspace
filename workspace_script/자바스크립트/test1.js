//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.
const a = []; // javascript에서 무조건 배열

// 배열 : 데이터 여러개 존재(반복문 가능) + 접근할 때 순번으로 접근

// object(객체)
// ㄴ key값은 중복 불가능
// ㄴ 문법상 오류는 나지 않아서, 실행 가능
// ㄴ 단, 데이터를 가져오려고 하면 마지막 입력값을 가져옴.


const item_list = [
  // item_list 가 감싼 [] -> 배열
  // [] 안의 {}는 객체
  
  {
    item_name : '여름 셔츠',
    price : 25000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
for(let i = 0 ; i < item_list.length ; i++){
  if(item_list[i].brand == 'java마켓'){
    // console.log(item_list[i].item_name, item_list[i].price); // 내가 한거
    console.log(`상품명 : ${item_list[i].item_name} / 가격 : ${item_list[i].price}`); // 강사님 방식
  }
}


// item_list가 배열이라서 반복 가능
// const 와 of 사이 값 -> item_list 에서 하나씩 빼서 넣을 값
for(const item of item_list)
  if(item.brand == 'java마켓'){
    console.log(`상품명 : ${item.item_name} / 가격 : ${item.price}`); // 강사님 방식
  }

// forEach문
// item -> item_list 빼서 뭐라할건지 정하는 이름
// i -> 돌린 횟수를 뭐라고 정할지 정하는 이름
item_list.forEach((item, i)=>{
  if(item.brand == 'java마켓'){
    console.log(`상품명 : ${item.item_name} / 가격 : ${item.price}`); // 강사님 방식
  }
});


//2. 95 사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
// forEach문
item_list.forEach((item, i)=>{ 
  // item_list라는 배열을 for문 돌려서 순차적으로 찾아냄
  // 그걸 빼낸걸 item이라고 하고 그 item은 객체임.
  item.size.forEach((size, j)=>{ 
    // 그 item 객체 안에 있는 것에 접근하려면 . 찍을 수 있음
    // . 찍고 그 객체 안에 size라는 것에 접근
    // 그 size에 접근하면 size 안에 있느 것들은 또 배열임.
    // 그 배열을 다시 for문 돌림.
    // 그럼 그 size 안에 있는 것들은 정수형으로 나옴.
    // 그걸 if문으로 비교하면 됨. 
    if(size == 95)
      console.log(item.item_name);
  });
});

//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.

const data = [
  {
    stuName : 'kim',
    age : 20
  },
  {
    stuName : 'lee',
    age : 25
  }
];

// 데이터(객체) 추가하기

const add_data1 = {
  stuName : 'park',
  age : 30
};

// 변수 만들고 넣는 방법
data.push(add_data1);
// 변수 안 만들고 바로 넣는 방법
data.push({
  stuName : 'park',
  age : 30
})

function addItem(){
  // 추가할 객체
  // 변수를 사용한 방식
  const brand = document.querySelector('#brand').value;
  
  // 체크박스를 가져오는 방법 
  // 체크박스 여러개를 가져온 것들
  // 태그 여러개 가져온건 - 배열

  // 들고 온 것들 중에 만약에 체크가 되었으면 그 값만 출력함.
  // const chks = document.querySelectorAll('.size');
  // chks.forEach((chk, i)=>{
  //   if(chk.checked){
  //     console.log(chk.value);
  //   }
  // });

  // 체크가 된 것들만 들고와서 그 값만 출력함.
  const chks = document.querySelectorAll('.size:checked');

  // 배열 넣어주기 위해서 빈 배열 만들기
  const size = [];
  
  chks.forEach((chk, i)=>{
  // 배열에 추가하기
  size.push(chk.value);
  });

  const add_data = {
    // 다이렉트 방식
    item_name : document.querySelector('#itemName').value,
    price : document.querySelector('#price').value,
    brand : brand,
    size : size
  };
  
  // 추가하기
  item_list.push.add_data;
  
  console.log(item_list);
};
