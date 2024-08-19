package 일곱번째_메소드.일반_문제;

import java.util.Scanner;

public class Test_1_12 {
    public static void main(String[] args) {
        // 10번 문제에서 매개변수로 받는 이름, 나이, 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = sc.nextInt();
        String aa = sc.next();
        test(n, a, aa);
    }

    public static void test(String name, int age, String addr){
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
    }
}
