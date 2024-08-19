package 다섯째_반복문.문제_for;

import java.util.Scanner;

public class Test_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 수 : ");
        int num2 = sc.nextInt();

        // 큰 수, 작은 수 저장
        int max, min;
        if(num1 > num2){
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        // min = 1, max = 10 가정 / 2~9까지의 합
        int sum = 0;
        // min ~ max 더한 값 저장할 공간
        for(int i = min + 1 ; i < max ; i++ ){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
