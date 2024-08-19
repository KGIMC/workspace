package 네번째_조건문.예제;

import java.util.Scanner;

public class 예제_3 {
    public static void main(String[] args) {
        // 정수 입력 받아서
        // 입력받은 정수가 3의 배수이면서 5의 배수 일때만
        // '1' 출력

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            // && - 그리고
            System.out.println(1);
        }
        System.out.println("프로그램 종료");
    }
}
