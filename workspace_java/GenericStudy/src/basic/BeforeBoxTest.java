package basic;

// 좋은 코딩은 컴파일 오류가 많이 나는 코드다.
// 컴파일 오류 :: 코드를 실행하기 전에 발생하는 오류, 빨간줄로 표시됨 ( 직관적인 오류 확인 가능 )
// 런타임 오류 :: 실행했을 때만 오류가 발생하는 오류, 빨간줄로 표시 안됨 ( 직관적인 오류 확인 불가능 및 수정 시간 오래 걸림 )

// Generic을 사용하지 않았을 때의
// 단점.1 :: 데이터를 리턴 받을 때 매번 형변환 작업 진행 ( 귀찮음 )
// 단점.2 :: 개발자의 실수로 런타임 오류가 발생할 확률이 높다
public class BeforeBoxTest {
    public static void main(String[] args) {

        // BeforeBox 객체 생성
        BeforeBox box1 = new BeforeBox();
        box1.setData("apple");

        BeforeBox box2 = new BeforeBox();
        box2.setData(5);

        BeforeBox box3 = new BeforeBox();
        box3.setData(new Apple());

        BeforeBox box4 = new BeforeBox();
        box4.setData(new Orange());


        // box1에 저장된 데이터를 받아오기
        // BeforeBox에서 형변환해서 받아와야함.
        String data1 = (String)box1.getData();
        String data11 = box1.getData().toString();

        int data2 = (int)box2.getData();
        Apple data3 = (Apple)box3.getData();


        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data3 = " + data3);
    }
}
