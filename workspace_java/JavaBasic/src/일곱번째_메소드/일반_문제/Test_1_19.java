package 일곱번째_메소드.일반_문제;

public class Test_1_19 {
    public static void main(String[] args) {
        test("Go to Home : ", 3);
    }
    public static void test(String s, int num){
        String result = "";
        for(int i = 0 ; i < num ; i++){
            result = result + s;
        }
        System.out.println(result);
    }
}
