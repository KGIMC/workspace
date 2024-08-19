package class_basic.member2;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberServiceExample MemberServiceExample = new MemberServiceExample();
        boolean result = MemberService.login("hong", "12345");

        if(result){
            System.out.println("로그인 되었습니다.");
            MemberService.logout("hong");
        }else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
