package 네번째_조건문.문제.문제_IF_S;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();

        // 10의 자리
        int tens = num / 10;
        // 1의 자리
        int ones = num % 10;

        // 박수의 횟수
        int clapCnt = 0;

        // 10의 자리가 3,6,9면 clapCnt 1증가
        if(tens == 3 || tens == 6 || tens == 9){
            // 하나만 만족해도 되면 vertical var
            // 다른 방법 tens % 3 == 0 && tens != 0
            clapCnt++;
//            ++clapCnt;
//            clapCnt = clapCnt + 1;
//            clapCnt += 1;
        }
        // 1의 자리가 3,6,9면 clapCnt 1증가

        if(ones == 3 || ones == 6 || ones == 9){
            clapCnt++;
        }

        switch (clapCnt){
            case 1:
                System.out.println("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");

        }
    }
}
