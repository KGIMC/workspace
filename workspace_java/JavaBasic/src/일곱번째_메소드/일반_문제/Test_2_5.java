package 일곱번째_메소드.일반_문제;

public class Test_2_5 {
    // 임의의 정수를 매개변수로 받아,
    // 만약 매개변수로 받은 정수가 90 이상이면 ‘A’,
    // 70 이상이면 ‘B’, 그 외의 수가 들어오면 ‘C’를
    // 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        String r = test(60);
        System.out.println(r);
    }

    public static String test(int a){
        if(a >= 90){
            return "A";
        } else if(a >= 70){
            return "B";
        } else {
            return "C";
        }
    }
}
