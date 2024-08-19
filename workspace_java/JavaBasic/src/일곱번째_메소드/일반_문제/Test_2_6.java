package 일곱번째_메소드.일반_문제;

public class Test_2_6 {
    // 매개변수로 정수를 입력받아,
    // 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        String result = test(12);
        System.out.println(result);
    }

    public static String test(int a){
        // 정수 -> 문자열
        // String sa = String.valueOf(10);

        // 문자열 -> 정수
        // int ra = Integer.parseInt("10");

        return a + "";

    }

}
