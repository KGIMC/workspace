package 네번째_조건문.문제.문제_IF_1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        a = sc.nextInt();
        System.out.print("점수 입력 : ");
        b = sc.nextInt();
        c = a + b;

        if(c >= 50){
            System.out.println("두 수의 합이 50보다 큽니다.");
        }
        else{
            System.out.println("두 수의 합이 50보다 작습니다.");
        }
    }
}
