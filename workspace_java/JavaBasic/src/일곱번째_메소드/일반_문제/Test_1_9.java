package 일곱번째_메소드.일반_문제;

public class Test_1_9 {
    public static void main(String[] args) {
        // 이름을 매개변수로 받아 이름을 출력하는 메소드,
        // 나이를 매개변수로 받아 나이를 출력하는 메소드,
        // 주소를 매개변수로 받아 주소를 출력하는 메소드를
        // 각각 만들고 출력결과가 아래와 같게 프로그래밍하세요.
        test("김세훈", 34, "울산");
    }
    public static void test(String name, int age, String addr){
        System.out.println("이름은 : " + name);
        System.out.println("나이는 : " + age);
        System.out.println("주소는 : " + addr);
    }
}
