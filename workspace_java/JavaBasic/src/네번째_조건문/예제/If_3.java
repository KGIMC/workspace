package 네번째_조건문.예제;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        // 키보드로 정수 하나를 입력 받아
        // 입력받은 수가 양수이면 '1', 음수이면 '2', 0이면 '0' 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 :");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(1);
        }
        // 그렇지 않고 만약에
        else if(num < 0) {
            System.out.println(2);
        }
        // 그렇지 않으면 ( 조건 없음 )
        else {
            System.out.println(0);
        }
    }
}
