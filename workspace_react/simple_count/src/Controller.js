function Controller(props){

  return(
    <div className="box">
      <button type="button" value="-10" onClick={(e)=>{
        props.changeCount(e.target.value);
      }}>-10</button>
      <button type="button" value="-1" onClick={(e)=>{
        props.changeCount(e.target.value);
      }}>-1</button>
      <button type="button" value="+1" onClick={(e)=>{
        props.changeCount(e.target.value);
      }}>+1</button>
      <button type="button" value="+10" onClick={(e)=>{
        props.changeCount(e.target.value);

        // 현재 클릭한 타겟을 알려주는 것
        // button을 클릭한다는 소리 (태그)
      }}
      >+10</button>
    </div>
  );
}

export default Controller;