package Interface;

// 인터페이스는 메소드의 이름만 존재함.
// 멤버변수 x, 생성자 x
// 생성자가 없기 때문에 인터페이스는 객체 생성 불가
// 인터페이스는 클래스에 얹혀살아야함. ( 단독으로 아직까지는 사용 불가 - 추후에는 다를수도 )
// 클래스에 인터페이스를 적용하는 문법 ( 클래스 선언 시 적용 )
// public class 클래스명 implements 인터페이스명
// 위의 코드를 해석하면
// 인터페이스로 구현한 클래스를 생성하겠다.
// 인터페이스 안의 추상메소드는 public을 생략하면 자동으로 public이 붙음
public interface Machine {

    public void takeCoffee(); // 추상메소드 (몸통이 없다. 추상적이다.)
    public void takeMilk();
}
