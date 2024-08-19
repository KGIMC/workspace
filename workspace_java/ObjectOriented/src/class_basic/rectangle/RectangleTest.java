package class_basic.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        // 매개변수가 하나도 없는 생성자를 호출
        Rectangle s = new Rectangle(1, 1, 2, 3);
        // 생성자(매개변수 있는) 만드니까 오류 사라짐.

        // show라는 메소드 만들면 show에 오류 됐던것들 다 사라짐.
        r.show();
        s.show();
        System.out.println(s.sqaure());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.sqaure());

        if(r.equals(s)){
            System.out.println("두 사각형의 넓이는 같습니다.");
        }
    }
}
