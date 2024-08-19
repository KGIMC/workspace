package 상속.케이크;

public class CakeTest {
    public static void main(String[] args) {

        CheeseCake c = new CheeseCake();
        c.eat(); // 자식 클래스에서 재정의한 메소드가 출력됨.

        // c 객체로부터 부모클래스에서 선언한 eat() 메소드를 호출할 수 있냐?
        // 덮어씌웠기 때문에 호출 불가능

    }
}
