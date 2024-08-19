package 일곱번째_메소드.일반_문제;

public class Test_2_8 {
    // 세 정수를 매개변수로 받아,
    // 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        System.out.println(test(1, 2, 3));
    }

    public static double test(int a, int b, int c){
        return (a + b + c) / 3;
    }
}
