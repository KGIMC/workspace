package 네번째_조건문.문제.문제_IF_S;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 변의 길이 : ");
        int a = sc.nextInt();
        System.out.println("두번째 변의 길이 : ");
        int b = sc.nextInt();
        System.out.println("세번째 변의 길이 : ");
        int c = sc.nextInt();

        // 가능, 불가능인 경우 쓰는게 조건문(if)

        if(a + b > c  &&  b + c > a  &&  a + c > b){
            System.out.println("삼각형 가능");
        }
        else{
            System.out.println("삼각형 불가능");
        }
    }
}
