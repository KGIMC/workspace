package 일곱번째_메소드.예제;

public class Method_4 {
    public static void main(String[] args) {
        introduce("자바", 20, "울산");
        // 매개변수의 갯수가 일치해야 호출이 됨.

        String a = "홍길동";
        int b = 40;
        String c = "서울";

        introduce(a, b, c);

    }

    public static void introduce(String name, int age, String addr){
        // String name = a; // a = 홍길동
        // int age = b; // b = 40
        // String addr = c; // c = 서울
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);

    }
}
