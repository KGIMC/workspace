package 변수와자료형.예제;

public class 변수_4 {
    public static void main(String[] args) {
        // 변수는 선언 후 최초값을 반드시 한 번은 할당해야함.
        int num;
        num = 5; // 이 코드가 사라지면 오류 발생함.
        System.out.println(num);

        // 변수의 선언 및 값 할당은 동시에 가능
        int a; // 따로 선언한 경우
        a = 7; //

        int b = 7; // 동시에 선언한 경우

        // 자료형이 같은 변수는 한 번에 여러개 선언 가능
        int a1, b1, c1;
        a1 = 10;
        b1 = 10;
        c1 = 10;
    }
}
