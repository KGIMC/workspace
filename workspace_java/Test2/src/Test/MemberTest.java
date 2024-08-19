package Test;

public class MemberTest {
    public static void main(String[] args) {
        Member mem = new Member();

        mem.setInfo("자바", "java", "abcd1234", 20);

        mem.showInfo();

        // 로그인 가능한 경우
        mem.isLogin("java", "abcd1234");
        mem.isLogin("java", "abcd");
    }
}
