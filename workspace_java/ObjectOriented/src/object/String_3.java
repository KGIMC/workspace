package object;

public class String_3 {
    public static void main(String[] args) {
        // String 객체의 특이점
        // 기본 자료형이랑 같은 결과가 나옴.
        // String 객체는 Imutable(값이 변하지 않는) 객체
        String addr1 = "울산";
        String addr2 = addr1;
        addr1 = "서울";

        System.out.println(addr1);
        System.out.println(addr2);

        // 값이 변하지 않는다.
        String a = "java";
        a = "python";

        System.out.println(a);
    }
}
