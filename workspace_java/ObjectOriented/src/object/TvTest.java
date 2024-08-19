package object;

import 상속.폰.MobilePhone;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();

        // 객체명.변수명
        // 객체명.메소드명으로 변수와 메소드 호출 가능
        System.out.println(tv.modelName);
        tv.powerOn();
        // Object 클래스는 모든 클래스의 부모 클래스다.
        // 자바는 자료형이 다르면 데이터 저장 불가 ( Object는 예외 )
        // 다형성에 의해서 부모클래스로 자식클래스 객체를 지정할 수 있다.
        Object o1 = new Tv();
        // Object는 가상 객체 , Tv는 실 객체
        Object m1 = new MobilePhone();
    }
}
