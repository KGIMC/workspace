package basic;

// Generic 등장 이전의 코딩 방식과 문제점


// 어떤 데이터든 넣고 뺄 수 있는 상자
public class BeforeBox {
    private Object obj;

    // 어떤 데이터든 저장할 수 있는 메서드
    public void setData(Object obj){
        this.obj = obj;
    }
    // 어떤 데이터든 리턴할 수 있는 메서드
    public Object getData(){
        return obj;
    }




}
