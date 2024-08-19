package 네번째_조건문.문제.문제_IF_1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");

        a = sc.nextInt();
        if(a % 5 != 0){
            System.out.println("5의 배수를 입력하세요");
        }

    }
}
