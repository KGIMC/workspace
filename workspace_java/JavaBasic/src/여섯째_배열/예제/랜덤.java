package 여섯째_배열.예제;

public class 랜덤 {
    public static void main(String[] args) {
        // 1~10의 랜덤한 정수


        // 0.0 <= x <= 1.0 실수를 줌
        // double ran = Math.random();

        // 0.0 <= x <= 1.0 // 양변에 x 10 하기
        // 0.0 <= x <= 10.0 // 0 포함 9.9999까지 나옴
        // +1 하면 1.0 <= x <= 11.0
        int rand = (int)(Math.random() * 10 + 1);

        System.out.println(rand);
    }
}
