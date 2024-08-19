package 상속.폰;

public class PhoneTest {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        SmartPhone s1 = new SmartPhone();

        // 부모클래스로는 자식 클래스의 객체를 받을 수 있음
        // 다형성으로 생성된 객체는 부모클래스의 변수, 메소드만 사용 가능

        MobilePhone m2 = new SmartPhone(); // 상속관계에서만 가능 // 부모 -> 자식은 가능
//        smartPhone s2 = new MobilePhone(); // 오류 남 ~ // 자식 -> 부모 불가능
        // 모바일 폰 달라햇는데 스마트폰으로 모르고 받음
        // 스마트폰 기능 사용 불가능
        m2.sendMsg();
    }
}
