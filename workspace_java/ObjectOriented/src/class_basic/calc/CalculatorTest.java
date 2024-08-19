package class_basic.calc;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("첫번째 수 : ");
        int num1 = sc.nextInt();

        System.out.println("두번째 수 : ");
        int num2 = sc.nextInt();

        System.out.println("연산자 : ");
        String oper = sc.next();

        // cal 객체의 num1과 num2를 키보드로 입력받은 값으로 변경해줘야함.
        cal.setNumber(num1, num2);


        if(oper.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + cal.getSum());
        } else if (oper.equals("-")){
            System.out.println(num1 + " - " + num2 + " = " + cal.getSub());
        } else if (oper.equals("*")){
            System.out.println(num1 + " * " + num2 + " = " + cal.getMulti());
        } else if (oper.equals("/")){
            System.out.println(num1 + " / " + num2 + " = " + cal.getDiv());
        } else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }


    }
}
