package 여섯째_배열.문제;

import java.util.Scanner;

public class Test_2_1 {
    public static void main(String[] args) {
        /*scanner로 정수 하나를 입력받아 입력받은
        정수만큼의 길이를 갖는 배열을 생성하고 배열에
        각 요소에 1 ~ 입력 받은 정수로 값을 저장한다
        예를 들어 5를 입력했으면 길이가 5인 배열을 만들고
        각 요소에 1,2,3,4,5가 들어가야 한다. 그 후 배열에 들어간 수의 평균을 출력해보자.*/

        // 정수 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기 : ");
        int length = sc.nextInt();

        // 입력받은 정수만큼의 크기의 배열의 선언과 생성
        int[] arr1 = new int[length];

        for(int i = 0 ; i < arr1.length ; i++){
            // 배열의 요소가 0부터 시작이기에 그걸 1부터 시작하게 만들려면
            // 해당 요소의 시작값 증가시켜주기 위해 1+ 시킴
            arr1[i] = i + 1;
        }

        // 합 저장할 변수
        int sum = 0;

        // 합 구하기
        for(int e : arr1){
            sum = sum+e;
        }

        // 평균 구하기
        System.out.println(sum / (double)arr1.length);

    }
}
