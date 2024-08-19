package 여섯째_배열.문제;

import java.util.Scanner;

public class Test_1_10_Top {
    public static void main(String[] args) {
        /*
        정수를 5개 저장할 수 있는 배열을 만들고,
        scanner를 통해 입력받은 값을 하나씩 배열의 요소에 저장해보자.
        키보드로 1 2 3 4 5를 입력했다면
        배열의 요소에 각각 1, 2, 3, 4, 5 가 저장되어야 한다.
        출력을 통해 결과를 확인해 보아라.
        */

        // 정수를 5개 저장할 수 있는 배열
        int[] arr1 = new int[5]; // 0, 0, 0, 0, 0

        // scanner를 통해 입력받기
        Scanner sc = new Scanner(System.in);

        // 배열의 크기만큼 반복해서 입력값을 각 요소에 저장
        for(int i = 0; i< arr1.length; i++){
            System.out.println(i + "번째 요소 입력");
            arr1[i] = sc.nextInt(); // arr1이라는 배열에 정수를 입력받기
            // arr1이 0~4까지 반복되니 순차적으로 1씩 증가하면서 정수 입력 받음
        }


        System.out.println("배열에 저장된 요소");
        for(int i = 0;  i <arr1.length; i++){
            // 배열의 요소만큼 반복하기
            System.out.print(arr1[i] + " ");
            // 배열의 요소값 출력하기
        }

        System.out.println();

        for(int e : arr1){
            System.out.print(e + " ");
        }

        }
    }
