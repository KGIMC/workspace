package Test;

public class CalTest {
    public static void main(String[] args) {
        Calculate cal = new Calculate();

        cal.setNumber(20, 10);

        System.out.println("합 : " + cal.getSum());

        System.out.println("큰 수 : " + cal.getMax());

        System.out.println("평균 : " + cal.getAvg());
    }
}
