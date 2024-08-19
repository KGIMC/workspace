package Static;

public class InitTest {
    public static void main(String[] args) {

        StaticInit i1 = new StaticInit();
        StaticInit i2 = new StaticInit();
        StaticInit i3 = new StaticInit();


        // static 변수를 읽고 사용하는 방법
        // 객체명.변수명으로 static 변수도 사용 가능. 추천하지 않는 방법
        System.out.println(i1.num);
        System.out.println(i2.num);
        // num은 변수임.
        // 객체 안에 있는 변수라는 설명은 이상함.

        // static 변수 및 메소드는
        // 클래스명.변수명으로 접근
        // 이러한 접근 방법은 객체를 만들지 않아도 사용 가능
        System.out.println(StaticInit.num);

        Math.random();

        
    }
}
