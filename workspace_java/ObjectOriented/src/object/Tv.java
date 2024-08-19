package object;


import class_basic.monitor.Monitor;
import 상속.폰.MobilePhone;

// 클래스가 상속을 받고 있지 않다면 자동으로 object 클래스를 상속 받음.
// 모든 클래스는 Object 클래스를 상속 받는다.
public class Tv { // object 받고 있는 중
    String modelName;

    public void powerOn(){
       System.out.println("전원을 켭니다~");
       aaa(1);
       Monitor mm = new Monitor(); // 객체 만들어서 아래에 넣으면 댐.
       bbb(mm); // 모니터 매개변수를 여기다 넣어라.
        Object obj = new Object();
        ccc(mm); // obj 클래스는 뭘 넣어도 오류 안남.
    }
    public void bbb(Monitor m){
        // 모니터 매개변수 만듬.
    }

    public void ccc(Object obj){

    }

    public void aaa(int a){

    }
}

class lgTv extends Tv{

}