package 다섯째_반복문.문제_for;

import java.util.Scanner;

public class Test_1_15 {
    public static void main(String[] args) {

        // 임의의 정수를 입력받아
        // 1부터 입력받은 수까지 중 짝수의 개수를 구하여라

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 :");

        int num = sc.nextInt();
        // 랜덤 정수 입력 받는 문법

        int cnt = 0;
        // 짝수값 저장할 공간

        for(int i = 1; i < num+1; i++){
            // 1부터 직접 입력받는 정수값(num)까지 차례대로 1씩 증가시키면서
            if(i % 2 == 0){
                // 그 수중 만약 2의 배수가 있으면
                cnt++;
                // cnt(2의 배수값을 저장할 공간에) cnt 값을 계속 저장
            }
        }
        System.out.println(cnt); // 최종적으로 cnt값만 출력
    }
}
