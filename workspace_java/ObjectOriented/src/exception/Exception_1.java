package exception;

import java.util.Scanner;

// 예외처리
/*  예외처리 문법
    try{
        여러줄 들어오는거 가능
        예외가 발생할 수도 있는 코드를 여기서 작성
    }catch(Exception e){
        예외 발생 시 실행 코드
    }finally{ -> 생략 가능
        예외가 발생하든, 하지 않던 무조건 실행할 코드
    }
 */
public class Exception_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("첫번째 : ");
            int a = sc.nextInt();
            System.out.println("두번째 : ");
            int b = sc.nextInt();
            System.out.println(a/b);
            // 예외가 발생한 지점까지만 실행
            // 예외 발생 즉시 catch문 실행함

        } catch (Exception e){ // 예외에 대한 정보가 들어있는 클래스
            System.out.println("오류 발생");
            System.out.println(e.getMessage()); // 예외 발생 이유를 간략히 문자열로 알려줌.
            e.printStackTrace(); // 해당 메소드의 실행 결과
        }
        System.out.println("프로그램 종료");
    }
}
