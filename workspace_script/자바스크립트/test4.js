// 전체 선택 및 해제
function checkAllMenu(){
  // 체크 박스를 선택한 것
  // document.querySelector('#chk_all')

  // 전체 체크 박스 선택해서 체크가 되어있는지 안되어있는지 여부 확인
  const isChecked = document.querySelector('#chk_all').checked;

  // 모든 체크 박스 들고오기
  const chks = document.querySelectorAll('input');

  if(isChecked){
     // 전체 체크 박스 체크가 되어있으면 여기가 실행  
     for(const chk of chks){
        chk.checked = true;
     }
  } else {
     // 전체 체크 박스 체크가 안되어있으면 여기가 실행
     for(const chk of chks){
        chk.checked = false;
     }
  }
}


const chechkAllOption = (checkbox) => {
  // 다음 형제 태그인 Ul 태그를 선택하는 것
  // checkbox.nextElementSibling

  // 다음 형제 태그 안의 모든 input 태그를 선택
  // checkbox.nextElementSibling.querySelectorAll('input'); 
  const chks = checkbox.nextElementSibling.querySelectorAll('input');

  if(checkbox.checked){
    for(const chk of chks){ 
        chk.checked = true;
    }
  } else {
    for(const chk of chks){
      chk.checked = false;
  }
  }
}