package 일곱번째_메소드.일반_문제;

public class Test_1_10 {
    public static void main(String[] args) {
        String name = "김세훈";
        int age = 34;
        String addr = "울산";

        introduce(name, age, addr);
    }

    public static void introduce(String name, int age, String addr){
        System.out.println("이름은 : " + name);
        System.out.println("나이는 : " + age);
        System.out.println("주소는 : " + addr);
    }
}
