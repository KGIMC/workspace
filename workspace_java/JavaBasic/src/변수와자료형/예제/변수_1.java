package 변수와자료형.예제;

public class 변수_1 {
    public static void main(String[] args){
        // 변수 - 값을 저장할 수 있는 공간
        // 변수를 사용하기 위해서는 변수를 먼저 선언해야 한다.
        // 변수 선언 문법 : 자료형(data type) 변수명;

        int num; // 정수를 저장할 공간 num 선언
        // '=' 우측의 값을 왼쪽에 저장(대입, 할당)한다
        //  = 대입연산자
        num = 5;
        // num = 1.5; 오류남
        System.out.println("num");
        System.out.println(num);

        System.out.println("num =" + num);

        num = 10;
        // 하나의 변수에는 하나의 값만 저장
        // 가장 최근(마지막) 값만 저장
        System.out.println("num =" + num);
    }
}
