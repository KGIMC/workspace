package 일곱번째_메소드.일반_문제;

public class Test_2_3 {

    // 두 정수를 매개변수로 받아,
    // 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        int result = test(50, 60);
        System.out.println(result);
    }

    public static int test(int a, int b) {
        return a > b ? a : b;
        // a가 b보다 크면 a 실행

    }
        /*if(a > b){
            return a;
        }
        else {
            return b;
        }*/
}