package 일곱번째_메소드.일반_문제;

public class Test_2_4 {
    // 두 문자열을 매개변수로 받아,
    // 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        String result = test("1", "2");
        System.out.println(result);
    }

    public static String test(String s1, String s2){
        return s1 + s2;
    }
}
