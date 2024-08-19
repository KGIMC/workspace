package 일곱번째_메소드.일반_문제;

import java.util.Scanner;

public class Test_2_2 {
    // scanner로 입력받은 두 정수를 매개변수로 받아,
    // 두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = test(a, b);
        System.out.println(result);
    }

    public static int test(int a, int b){
        return a * b;
    }

}
