package 다섯째_반복문.문제_while;

import java.util.Scanner;

public class Test_1_15 {
    public static void main(String[] args) {

        // 임의의 정수를 입력받아
        // 1부터 입력받은 수까지 중 짝수의 개수를 구하여라

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num = sc.nextInt(); // 10을 입력받았고 가정
        int i = 1;
        int cnt = 0;

        while(i < num + 1){
            if(i % 2 == 0){
                cnt++;
            }
            i++;
        }
        System.out.println("짝수의 개수 : " + cnt);

    }
}
