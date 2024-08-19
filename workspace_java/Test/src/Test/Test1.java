package Test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 정수를 입력하세요: ");
        int num3 = scanner.nextInt();


        if(num1 >= num2 && num1 >= num3){
            System.out.print(num1 + " ");
            if( num2 >= num3){
                System.out.println(num2 + " " + num3);
            } else {
                System.out.println(num3 + " " + num2);
            }
        } else if(num2 >= num3) {
            System.out.print(num2 + " ");
            if(num3 >= num1){
                System.out.println(num3 + " " + num1);
            } else {
                System.out.println(num1 + " " + num2);
            }
        } else {
            System.out.print(num3 + " ");
            if(num1 >= num2){
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
    }
}
