package 일곱번째_메소드.일반_문제;

public class Test_1_18 {
    public static void main(String[] args) {

        test(1, 10);
    }

    public static void test(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        int cnt = 0;
        for(int i = min + 1 ; i < max ; i++){
            if(i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
