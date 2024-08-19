// Viewer 컴포넌트
function Viewer(props){
  // 화면에 보여주고 싶은 HTML을 컴포넌트에 따로 분리한 것

  return(
     <div className='box'>
        <div>
        <h3>현재 카운터</h3>  
        <p>{props.count}</p>
        </div>
      </div> 
  );
}

export default Viewer;
// 다른 페이지에서 Viewer 파일을 가져다 쓰겠다는 의미