package 일곱번째_메소드.일반_문제;

public class Test_1_17 {
    public static void main(String[] args) {

        test(10, 1);
    }

    public static void test(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        for(int i = min + 1 ; i < max ; i++){
            System.out.println(i);
        }
    }
}
