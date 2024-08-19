package 세번째_연산자.예제;

import java.util.Scanner;

public class 키보드입력_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // 정수를 입력 받을 땐 nextInt
        // 문자를 입력 받을 땐 next
        // 실수를 입력 받을 땐 nextDouble

        String r1 = sc.next();
        System.out.println("입력받은 글 : " + r1);

        double r2 = sc.nextDouble();
        System.out.println("입력받은 실수 :" + r2);
    }
}
