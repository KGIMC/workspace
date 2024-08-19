package 일곱번째_메소드.일반_문제;

import java.util.Scanner;

public class Test_1_13 {
    public static void main(String[] args) {
        // scanner로 정수 두 개를 입력받아,
        // 입력받은 두 수를 매개변수로 사용하여
        // 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        test(x, y);
    }

    public static void test(int a, int b){
        System.out.println(a + b);
    }
}
