package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("첫번째 : ");
            int a = sc.nextInt();
            System.out.println("두번째 : ");
            int b = sc.nextInt();

            System.out.println(a/b);

        } catch (ArithmeticException exception){
            System.out.println("수학적 오류 발생");
        } catch (InputMismatchException e) {
            System.out.println("입력 자료형 불일치");
        }
        System.out.println("프로그램 종료");
    }
}
