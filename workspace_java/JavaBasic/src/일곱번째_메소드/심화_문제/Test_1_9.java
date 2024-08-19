package 일곱번째_메소드.심화_문제;

import java.util.Arrays;

public class Test_1_9 {
    // 정수형 배열 하나를 매개변수로
    // 받아 배열의 요소 중 홀수를 제거한 새로운 배열을 리턴하는 메소드를 만들어보세요.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = test(a);

        System.out.println(Arrays.toString(result));
    }

    public static int[] test(int[] a) {
        // 매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for (int e : a) {
            if (e % 2 == 0) {
                cnt++;
            }
        }
        // 짝수만 저장될 배열 생성
        int[] resultArr = new int[cnt];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                resultArr[index] = a[i];
                index++;
            }
        }
        return resultArr;
    }
}
