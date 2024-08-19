package 변수와자료형.예제;

public class 변수_3 {
    public static void main(String[] args) {
        // 정수를 저장할 수 있는 공간 num1, num2
        // 빈 통 2개를 만든 상황이라고 생각
        int num1;
        int num2;

        // 빈 통(num1, num2) 2개에 각각 10, 20이 들어간 상황
        num1 = 10;
        num2 = 20;

        // 두 변수에 저장된 값을 바꾸기 전
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        // 이 곳에 두 변수의 값을 바꾸는 코드를 작성하세요.
        // num3 변수 선언
        // num2의 값을 num3에 저장
        // num1의 값을 num2에 저장
        // num3의 값을 num1에 저장

        int num3;
        num3 = num2;
        num2 = num1;
        num1 = num3;


        // 두 변수에 저장된 값을 바꾼 후
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
