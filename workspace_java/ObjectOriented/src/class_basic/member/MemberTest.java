package class_basic.member;

import javax.naming.Name;

public class MemberTest {
    public static void main(String[] args) {
        Member m1 = new Member();

        m1.setMemberInfo("김세훈", "뿡빵띠", "1234", 34);
        m1.printMemberInfo();

        m1.setName("김유진");
        m1.printMemberInfo();


    }
}
