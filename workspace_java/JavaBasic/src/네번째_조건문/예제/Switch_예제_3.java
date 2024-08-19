package 네번째_조건문.예제;

import java.util.Scanner;

/*
*  점수를 키보드로 입력받음(정수)
*  키보드로 입력 받은 점수가
*  90 <= x <= 100 'A' 출력
*  80 <= x <= 89 'B' 출력
*  70 <= x <= 89 'C' 출력
*  x < 70 '0' 출력
* */

public class Switch_예제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int score = sc.nextInt();

        switch(score / 10){
            case 10 :
            case 9 :
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            default:
                System.out.println('0');

        }
    }
}
