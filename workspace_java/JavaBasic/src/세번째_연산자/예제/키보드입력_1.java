package 세번째_연산자.예제;


import java.util.Scanner;

public class 키보드입력_1 {
    public static void main(String[] args) {
        // 키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in); // sc가 변수

        // 정수 하나를 키보드로 입력
        int i = sc.nextInt();


        System.out.println("i = " + i);
    }
}
