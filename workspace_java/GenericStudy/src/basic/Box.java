package basic;

// T의 위치는 자료형의 위치
// 대문자면 클래스나 인터페이스가 와야함.
// T :: 정해지지 않은 자료형
// Box<T> :: T가 자료형이 아니라 자료형이 정해지지 않은 제네릭 문법임을 컴파일러에게 인지시켜주는 문법
// 자료형이 정해지지 않았기 때문에 Generic이 적용된 클래스에서는
// 메서드 구현이 아주 제한적이다. -> Generic 클래스에서 원하는 기능 못 만든다.
// 이러한 문제를 해결하기 위해 타입인자(T)를 제한하는 문법을 사용! -> 타입 제한
public class Box<T> {

    // java 컴파일러는 T를 자료형으로 해석함.
    private T obj;

    // 어떤 데이터든 저장할 수 있는 메서드
    public void setData(T obj) {
        this.obj = obj;
    }

    // 어떤 데이터든 리턴할 수 있는 메서드
    public T getData(){
        return obj;
    }


}
