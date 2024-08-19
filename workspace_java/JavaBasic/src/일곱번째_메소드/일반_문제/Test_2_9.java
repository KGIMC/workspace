package 일곱번째_메소드.일반_문제;

public class Test_2_9 {
    // 한 정수를 매개변수로 받아,
    // 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요.
    public static void main(String[] args) {
        System.out.println(test(5));
    }

    // a = 10이라 가정
    public static int test(int a){
        int sum = 0;

        for(int i = 0; i < a + 1 ; i++){
            if(i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
}
