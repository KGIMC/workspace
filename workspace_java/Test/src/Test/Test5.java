package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {


        int[] arr = new int[3];

        System.out.println("만들어진 숫자 : " );
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = (int)(Math.random() * 9 + 1);
            System.out.print(" " + arr[i]);
            System.out.println();
        }
        System.out.println("숫자가 정해졌습니다. 게임을 시작합니다.");



        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("세번째 수를 입력하세요 : ");
        int num3 = sc.nextInt();

    }

}
