package 네번째_조건문.문제.문제_IF_1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        a = sc.nextInt();
        System.out.print("숫자 입력 :");
        b = sc.nextInt();

        if(a > b){
            System.out.println("a가 큽니다.");
        }
        else if(b > a){
            System.out.println("b가 큽니다.");
        }
        else if (a == b){
            System.out.println("값이 같습니다.");
        }
    }
}
