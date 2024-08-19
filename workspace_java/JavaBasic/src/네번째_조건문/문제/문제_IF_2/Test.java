package 네번째_조건문.문제.문제_IF_2;
// 07_IF_SWITCH 문제

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 수 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 : ");
        String oper = sc.next();

        if(oper.equals("+")){ // 3 + 5 = 8
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 + num2));
        }
        else if(oper.equals("*")){
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));
        }
        else if(oper.equals("/")){
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / (double)num2));
        }
        else if(oper.equals("-")){
            System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }


    }
}
