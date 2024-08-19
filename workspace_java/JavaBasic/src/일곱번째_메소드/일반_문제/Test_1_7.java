package 일곱번째_메소드.일반_문제;

public class Test_1_7 {
    public static void main(String[] args) {
        // 두 정수를 매개변수로 받아,
        // 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요.
        test(8, 3);
    }
    public static void test(int a, int b){
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
