
function setAvgAge(){
  // 선택할 쿼리 (여러개인 경우 All)
  const tds = document.querySelectorAll('.ageTd')
  
  // 동일한 태그가 여러개이기 때문에 값 가져오기 위해서
  // for 돌림

  // 가져온 나이값 담아둘 공간 만들어두기
  
  let sum = 0;
  tds.forEach((tdTag, i)=>{
    // 태그 안의 글자만 들고올때는 textContent
    const age = Number(tdTag.textContent); 
    // for문 돌려서 가져온 값 숫자로 변환
    
    // 그 숫자 sum이란 값에 넣기
    sum = sum + age;

    // tds 길이만큼 나누기
    const avg = sum / tds.length;

    document.querySelector('#resultTd').textContent = avg;

  });

  
}