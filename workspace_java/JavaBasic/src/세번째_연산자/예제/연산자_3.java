package 세번째_연산자.예제;

public class 연산자_3 {
    public static void main(String[] args) {
        // 증감연산자
        int a = 5;
        ++a; // a의 값을 1 증가시킴
        System.out.println(a); // 6
        a++; // a의 값을 1 증가시킴
        System.out.println(a); // 7
        --a; // a의 값을 1 감소시킴
        System.out.println(a); // 6
        a--; // a의 값을 1 감소시킴
        System.out.println(a); // 5

        System.out.println();

        // 증감 연산자를 단독으로 사용하는지 - 한줄에 사용할 경우 : 앞뒤에 쓰든 상관 없음
        // 다른 코드와 함께 사용하는지에 따라서 결과 달라짐
        // 다른 코드랑 함께 쓰는 경우
        // ++a : 먼저 1 증가 후 다른 코드 실행
        // a++ : a 먼저 출력 후 1 증가시킴

        int b = 5;
        System.out.println(++b); // 6 // 증감연산자 + 출력문 같이 사용한 것
        int c = 5;
        System.out.println(c++); // 5
        System.out.println(c); // 6

        int num1 = 10;
        int result = 10 + num1++;
        System.out.println(result); // 20
        System.out.println(num1); // 11

    }
}
