package 세번째_연산자.문제;

/*
    키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
    단, 점수들은 정수만 입력한다고 가정한다.
    모든 정보를 입력 받은 후
    입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력
*/

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        // 항상 변수를 먼저 선언하자. (주의)
        Scanner sc = new Scanner(System.in);
        String name;
        int korScore;
        int engScore;
        int mathScore;
        int totalScore;
        double avgScore;

        System.out.print("이름 : ");
        name = sc.next();

        System.out.print("국어 점수 : ");
        korScore = sc.nextInt();

        System.out.print("영어 점수 : ");
        engScore = sc.nextInt();

        System.out.print("수학 점수 : ");
        mathScore = sc.nextInt();

        totalScore = korScore + engScore + mathScore;
        avgScore = totalScore/3.0;

        System.out.println("-------- 입력 결과 --------");
        System.out.println("이름 : " +name);
        System.out.println("총점 : " +totalScore);
        System.out.println("평균 : " +avgScore);

    }
}
