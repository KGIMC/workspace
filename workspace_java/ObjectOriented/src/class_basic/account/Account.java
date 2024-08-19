package class_basic.account;

// 좋은 클래스의 여건
// 멤버 변수는 반드시 초기값을 설정해야함.
// 초기값 설정은 멤버변수 선언과는 별도로 진행

// 생성자 : 선언한 변수의 값을 초기화할 용도로 사용
/*
   생성자 생성 문법 : public 클래스명(){
     }
 */

// 클래스 안에는 반드시 생성자가 존재해야함.
// 만약 클래스 안에 생성자를 하나도 선언하지 않았다면, ( 생성자는 여러개 생성 가능 )
// 눈에 보이지 않는 기본 생성자 자동 생성 ( 내용도 없고, 매개변수도 없는 생성자 )
public class Account {
    String accNumber;
    String owner;
    int money;

    // 생성자 ( 변수의 초기화 작업 )
    // 리턴 타입 x, 클래스명과 완전하게 동일하게
    public Account(){
        accNumber = "미정";
        owner = "미정";
        money = 10000;
    }

    // 메소드 오버로딩 - 생성자에 적용 가능
    public Account(int a){
        money = a;
    }


    // 모든 변수의 값을 초기화하는 메소드
    public void setAccount(String accNumber, String owner, int money){
        // 이 클래스에서 선언한 accNumber (this.accNumber)
        this.accNumber = accNumber;
        this.owner = owner;
        this.money = money;
    }

    public void printAccount(){
        System.out.println("계좌번호 : " + accNumber );
        System.out.println("계좌주 : " + owner);
        System.out.println("예금액 : " + money);
    }
}
