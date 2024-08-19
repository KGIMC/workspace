package 일곱번째_메소드.일반_문제;

import java.util.Scanner;

public class Test_1_15 {
    public static void main(String[] args) {
        // 두 정수를 매개변수로 받아,
        // 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고,
        // 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
        // 두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를
        // 출력하는 메소드를 선언하고 호출해보세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        test(x, y);
    }

    public static void test(int a, int b){
        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("둘 다 짝수");
        } else if(a % 2 != 0 && b % 2 != 0){
            System.out.println("둘 다 홀수");
        } else{
            System.out.println("하나만 짝수");
        }

    }
}
