package 일곱번째_메소드.심화_문제;

public class Test_1_3 {
    // Math.random() 메소드를 활용하여 1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자.
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static int test(){
        return (int)(Math.random() * 50) + 1;
    }
}
