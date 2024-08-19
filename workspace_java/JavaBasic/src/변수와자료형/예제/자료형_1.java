package 변수와자료형.예제;

// 자료형이 다르면 데이터 저장 불가

// 자바는 크게 기본 자료형과 참조자료형으로 데이터의 형태를 구분
// 자바에서 기본 자료형의 형태는 총 8개
// 자바에서 참조 자료형의 형태는 무한대

// 기본 자료형
// 정수 타입 : byte, short, int, long
// 실수 타입 : float, double
// 논리 타입 : boolean
// 문자 타입 : char

// 문자열 타입 : String -> 기본 자료형 아님
// 기본 자료형 -> 소문자로 시작
// 참조 자료형 -> 대문자로 시작

public class 자료형_1 {
    public static void main(String[] args) {
        byte n1 = 100;
        // byte n2 = 1000; byte 범위 초과로 오류 발생
        int n2 = 1000;
        // int n4 = 10.5; 정수 타입에 실수 넣는거 불가능

        double n3 = 10.5;

        // 주의사항 : boolean은 "" 없음
        boolean b1 = true;
        boolean b2 = false;
        // boolean b3 = "false"; // "" 들어간건 문자로 취급

        // 문자열(0개 글자 이상 + ""로 감싸야함 )
        String s1 = "java";
        String s2 = "false";
        System.out.println(s1);
        System.out.println(s2);

        // 문자(한글자 + ''로 감싸야함)
        // 위의 조건을 만족 안하면 무조건 문자열
        char c1 = '1';
        System.out.println("c1 = " + c1);
        char c2 = 65;
        System.out.println("c2 = " + c2);
        char c3 = 'A';
        int c4 = c3;
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
    }
}
