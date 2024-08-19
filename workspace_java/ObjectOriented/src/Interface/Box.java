package Interface;

public class Box {
    // 도라에몽 주머니
    // String str; // String -> Object로 변경
      Object str;

    // wrapper 클래스
    // int 등의 기본 자료형을 클래스화 시킨 것
    // int 등의 기본 자료형을 감싸기
    public void setBox(Object str){ // 무엇이든 들어올수 있음
        // Object - 모든 클래스형 자료를 다 받을 수 있음.
        this.str = str;
    }

    public Object getBox(){
        return str;
    }
}
