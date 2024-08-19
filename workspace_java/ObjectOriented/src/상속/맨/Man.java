package 상속.맨;

// 상속 : 부모 클래스의 멤버 변수와 메소드를 물려받는 것
//         Man : 부모 클래스, 슈퍼클래스, 상위클래스
// BusinessMan : 자식 클래스, 서브클래스, 하위클래스
// 상속 사용 이유 : 코드의 재활용(초보자들이 상속을 이해하는 개념)
//                  연관성이 없는 다수의 클래스들에 연관성을 부여하여
//                  데이터의 관리를 효율적으로 할 수 있게 만들어주는 기능
public class Man {
    String name;

    public Man(){

    }

    public Man(String name){
        this.name = name;
    }

    public void tellName(){
        System.out.println("이름은 홍길동입니다.");
    }
}

// 상속 받은 클래스의 생성자 가장 첫번째 줄에는 super()라는 메소드가 숨겨져있음.
// super() : 부모 클래스의 기본(디폴트)생성자 호출
class BusinessMan extends Man{
    // Man 이라는 클래스를 확장(extends)시켜서 BusinessMan을 만듬.
    // BusinessMan에는 Man의 내용도 있음.
    String company;

    public BusinessMan(){
        super();
        System.out.println("생성자 호출");
    }

    public void tellCompany(){
        System.out.println("저는 삼성에 다닙니다.");
    }
}
