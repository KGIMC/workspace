package 출력문.예제;

public class Exam3 {
    public static void main(String[] args){
        // 문자열은 반드시 ""에 감싸서 작성
        System.out.println("안녕하세요");
        // 숫자는 ""에 감싸지 않는다
        System.out.println(10);
        // ""에 감싸지지 않은 수는 수식(연산)이 가능
        // ""에 감싼 수와 감싸지 않은 수는 수식(연산)이 불가능
        System.out.println("10");
        // 소괄호 안의 내용이 연산 가능하면 연산 결과 출력
        System.out.println(10+10);
        // 문자끼리의 합은 문자를 연결
        System.out.println("java"+"hello");
        // 숫자와 문자의 합은 문자로 간주하고 나열
        System.out.println(10+"java");

        System.out.println(10+20+"java"); //30java
        System.out.println(10+"java"+20); //10java20
        System.out.println(5+"java"+5*10); //5java50

        System.out.println(10 > 5); //true
        System.out.println(10 < 5); //false
        System.out.println(1 == 1); //true
        System.out.println(1 != 1); //false

    }
}
