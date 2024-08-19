package class_basic.member;

public class Member {
    // 이름, 아이디, 비번, 나이
    String name;
    String id;
    String pass;
    int age;

    // 모든 정보를 한번에 변경할 메소드
    public void setMemberInfo(String name1, String id1, String pass1, int age1){
        name = name1;
        id = id1;
        pass = pass1;
        age = age1;
    }

    // 정보 출력을 위한 메소드
    public void printMemberInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pass);
        System.out.println("나이 : " + age);
    }

    // 회원 이름을 변경
    public void setName(String name1){
        name = name1;
    }
}
