package class_basic.account;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // 새로운 생성자 account를 통해 new(새로운) 객체 (acc)를 만들어주세요.
        acc.printAccount();
       /* // 객체 초기화 ( 객체 실행 시 최초 1회 실행 )
        acc.initAccount();

        // 객체 호출
        acc.printAccount();*/

        Account acc1 = new Account(100000);
        acc1.printAccount();

//        acc1.setAccount();

    }
}
