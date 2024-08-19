package class_basic.monitor;

// 문법 연습용
public class MonitorTest {
    public void main(String[] args) {

        // 모니터 설계도에서 모니터 객체 생성
        // 객체 생성 문법 : 클래스명 객체명 = new 클래스명();
        Monitor m1 = new Monitor(); // 모니터 이름 m1

        // 객체의 정보(변수) 값을 확인하는 방법
        // 문법 : 객체명.변수명
        System.out.println(m1.brand); // m1 모니터의 브랜드명 출력
        System.out.println(m1.price); // m1 모니터의 가격 출력
        System.out.println(m1.color); // m1 모니터의 색상 출력

        // 객체명 중복 불가능
        Monitor m2 = new Monitor();
        m2.price = 1000;
        m2.brand = "삼성";
        m2.color = "블랙";
        System.out.println(m2.price);

    }
}
