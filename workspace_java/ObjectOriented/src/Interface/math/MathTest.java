package Interface.math;

// 자꾸 까먹으니 적어두기
// 실행 테스트 하기 위해선 클래스에 해당하는 테스트 만든 뒤
// 그 클래스 안에서 객체 생성 후 테스트
public class MathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.getMin(2, 1));
        System.out.println(mm.getCircleArea(18));
        System.out.println(mm.getMultiple(3, 2));

    }
}
