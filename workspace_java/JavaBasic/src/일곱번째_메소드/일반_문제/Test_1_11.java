package 일곱번째_메소드.일반_문제;

import java.util.Scanner;

public class Test_1_11 {
    public static void main(String[] args) {
        // 입력받은 정수를 매개변수로 받아,
        // 해당 정수를 출력하는 메소드를 선언하고 호출해보세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        test(x);
    }

    public static void test(int a){
        System.out.println(a);
    }
}
