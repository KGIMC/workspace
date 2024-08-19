package class_basic.man;

public class ManTest {
    public static void main(String[] args) {

      Man man = new Man("홍", 12, "씨");

        // 이름 변경
        // setter, getter를 쓰는 이유
        // 실수(직접적으로 데이터 넣는 행위)를 방지하기 위해서 멤버변수에 private를 걸어놨기에
        // 그걸 불러올 수 있게 설정해주는 장치

        System.out.println(man.getName());
        man.printMan();

    }
}
