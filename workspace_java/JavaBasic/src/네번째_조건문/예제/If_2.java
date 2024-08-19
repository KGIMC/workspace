package 네번째_조건문.예제;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int x;
        x = sc.nextInt();
        // x의 값이 7이면 '1'을 출력
        // 그렇지 않으면 '2'를 출력

        // 만약에
        if(x == 7) {
            System.out.println(1);
        }
        // 그렇지 않으면
        else{
            System.out.println(2);
        }

        System.out.println("프로그램 종료");
    }
}
