package class_basic.calc2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수 : ");
        int a = sc.nextInt();

        System.out.println("연산자 : ");
        String oper = sc.next();

        System.out.println("두번째 수 : ");
        int b = sc.nextInt();


        switch(oper){
            case "+" :
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(a + " + " + b + " = " + add.calculator());
                break;
            case "-" :
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(a + " - " + b + " = " + sub.calculator());
                break;
            case "*" :
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(a + " * " + b + " = " + mul.calculator());
                break;
            case "/" :
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(a + " + " + b + " = " + div.calculator());
                break;
            default :
                System.out.println("연산자를 잘못 입력했습니다.");
        }
    }
}
