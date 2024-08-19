package 일곱번째_메소드.예제;

public class Method_5 {
    public static void main(String[] args) {
        int result = getSum(10, 20);
        System.out.println(result);
        // 위 아래 동일한 역할 ( 아래는 위를 축약시킨 것 )
        System.out.println((getSum(20, 40)));

        double result2 = getSum2(10, 20);
        System.out.println(result2);
    }

    // 매개 변수로 전달된 두 정수의 합을 리턴하는 메소드
    public static int getSum(int a, int b){
        return a + b ;
    }
    public static double getSum2(int a, int b){
        return a + (double)b ;
    }

}
