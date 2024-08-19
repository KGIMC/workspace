package 네번째_조건문.문제.문제_IF_2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        int max; // 큰 수를 저장하기 위함.
        int min; // 작은 수를 저장하기 위함.

        System.out.print("첫번째 수 : ");
        a = sc.nextInt();

        System.out.print("두번째 수 : ");
        b = sc.nextInt();

        if(a > b){
            max = a;
            min = b;
        }
        else{
           max = b;
           min = a;
        }
        System.out.println(max + " > " + min);
    }
}
