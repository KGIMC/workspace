package Static;

public class StaticInit { // static 초기화
    // Class 안에 Static이 붙은 변수가 있다면 생성자를 생성하기 전에 지 스스로 먼저 공간부터 만듬.
    // 해당 변수 이름으로
    // Static 키워드가 붙은 멤버변수는 생성자에서 초기화 하지 않기.
    // 초기화 구문이 따로 존재
    int a;
    static int num;

    // static 변수 초기화
    static{
        num = 5;
    }

    public StaticInit(){
        a = 10;
//        num = 5; // 생성자에서 static 초기화 금지
        num++;
        System.out.println("a : " + a);
        System.out.println("num : " + num);
    }

}
