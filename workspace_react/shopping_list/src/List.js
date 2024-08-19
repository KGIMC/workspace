function List(props){
  return(
  <div className='box'>
    <h3>장보기 목록</h3>
    {/* 자바스크립트 내용 넣기 위해선 {} 안에 넣기 */}
    {/* () 안에 내용은 매개변수 넣기 foreach 문과 동일 */}
    {/* map을 쓰는 이유는 return문을 쓸 수 있기 때문
    return문을 쓰는 이유는 화면에 출력 가능하기 때문 */}
    {
      props.list.map((item, i)=>{
        return (
          <div key={i} className="item-div">
            <span className="item">{item}</span> 
            <button type="button" onClick={(e)=>{
              // props.list.splice(i,1);
            // i를 넣는 이유, 자동으로 순차적으로 반복으로 돌아가면서 그려주기 때문에
            // 해당 값을 넣으면 내가 선택한 태그를 지워줌.
              // props.setList();

              // 배열은 값 바뀌는 것 조심하기.

              const copyList = [...props.list];
              // 데이터 복사
              copyList.splice(i, 1);
              // 복사한 데이터 지우기
              props.setList(copyList);
              // 데이터 전달

              // 위의 내용과 동일한 코드
              // props.list.splice(i, 1);
              // props.setList([...props.list]);
              
              

              // 선택한 것만 빼고 전부 삭제해버림.
              // props.setList([...props.list.splice(i,1)]);

            }}>삭제</button>
          </div>
        );
      })
    }
  
  </div>
  );
}

export default List;