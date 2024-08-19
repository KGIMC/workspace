package 네번째_조건문.문제.문제_IF_1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력 : ");

        a = sc.nextInt();
        String grade;
        // 문자열 넣기

        // java는 중복되는 문자열을 싫어함.
        // 현재 문자에서 중복되는 코드는 println

        if( a > 90 && a <= 100){
            grade = "A";
        }
        else if (a > 80 && a <= 90){
            // 90 이상은 걸러지니 a <= 90은 삭제해도 코딩에 문제 x
            grade = "B";
        }
        else{
            grade = "C";
        }
        System.out.println("학점은 " + grade);

    }
}
