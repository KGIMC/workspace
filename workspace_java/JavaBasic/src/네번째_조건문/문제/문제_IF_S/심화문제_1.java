package 네번째_조건문.문제.문제_IF_S;

import java.util.Scanner;

public class 심화문제_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int ab;
        int ac;
        int ba;
        int bc;
        int ca;
        int cb;

        System.out.println("삼각형 a변의 값을 입력 :");
        a = sc.nextInt();
        System.out.println("삼각형 b변의 값을 입력 :");
        b = sc.nextInt();
        System.out.println("삼각형 c변의 값을 입력 :");
        c = sc.nextInt();

        ab = a + b;
        ac = a + c;
        ba = b + a;
        bc = b + c;
        ca = c + a;
        cb = c + b;


        if(a < bc){
            System.out.println("A+BC의 경우 삼각형 완성 가능");
        }
        else if(a >= bc){
            System.out.println("A+BC의 경우 삼각형 완성 불가능");
        }
        if(a < cb){
            System.out.println("A+CB의 경우 삼각형 완성 가능");
        }
        else if(a >= cb){
            System.out.println("A+CB의 경우 삼각형 완성 불가능");
        }
        if(b < ac){
            System.out.println("B+AC의 경우 삼각형 완성 가능");
        }
        else if(b >= ac){
            System.out.println("B+AC의 경우 삼각형 완성 불가능");
        }
        if(b < ca){
            System.out.println("B+CA의 경우 삼각형 완성 가능");
        }
        else if(a >= ca){
            System.out.println("B+CA의 경우 삼각형 완성 불가능");
        }
        if(c < ab){
            System.out.println("C+AB의 경우 삼각형 완성 가능");
        }
        else if(c >= ab){
            System.out.println("C+AB의 경우 삼각형 완성 불가능");
        }
        if(c < ba){
            System.out.println("C+BA의 경우 삼각형 완성 가능");
        }
        else if(c >= ba){
            System.out.println("C+BA의 경우 삼각형 완성 불가능");
        }
    }
}
