package test;

import javax.naming.Name;
import java.sql.SQLOutput;

public class MemberTest {
    public static void main(String[] args) {
        Member mem = new Member();

        mem.setInfo("자바", "java", "abcd1234", 20);

        mem.showInfo();

        mem.isLogin("java", "abcd1234");
        mem.isLogin("java", "abcd");



    }
}
