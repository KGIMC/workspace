function setTable(){

  // 행 입력값 가져옴.
  const row = document.querySelector('#rowInput').value;
  // 열 입력값 가져옴.
  const col = document.querySelector('#colInput').value;

  console.log(row, col);

  let str = '';
  str += '<table>';

  for(let i = 0 ; i < row ; i ++) {
    str += '<tr>';

    for (let j = 0 ; j < col ; j ++){
      str += `<td>${i+1}행 ${j+1}열</td>`;
      // 몇행 몇열 사용하기 위해 백틱 사용
    }

    str += '</tr>';
  }


  str += '</table>';

  const divTag = document.querySelector('.table-div');
  
  divTag.innerHTML = '';
  divTag.insertAdjacentHTML('beforeend', str);

}