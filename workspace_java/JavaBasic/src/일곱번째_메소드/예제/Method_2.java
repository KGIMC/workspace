package 일곱번째_메소드.예제;

public class Method_2 {
    public static void main(String[] args) {
        System.out.println("시작");
        tellYorName();
        tellYourAge();
        System.out.println("종료");
    }

    public static void tellYorName(){
        System.out.println("제 이름은 김세훈입니다.");
    }

    public static void tellYourAge(){
        System.out.println("제 나이는 34살입니다.");
        tellYourAddr();
    }

    public static void tellYourAddr(){
        System.out.println("저는 울산에 삽니다.");
    }

}
