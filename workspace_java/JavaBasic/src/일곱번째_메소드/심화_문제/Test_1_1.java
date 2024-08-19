package 일곱번째_메소드.심화_문제;

public class Test_1_1 {
    // 정수 하나를 매개변수로 받아
    // 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요.
    public static void main(String[] args) {
       test(6);
    }

    public static void test(int a){
        int sum = 0;
        for(int i = 1 ; i < 10 ; i++){
            // a = 9까지 감
            sum = a * i;
            System.out.println(a + "*" + i + "=" + sum );
        }
    }
}
