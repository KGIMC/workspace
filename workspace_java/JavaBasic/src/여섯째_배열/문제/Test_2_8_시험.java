package 여섯째_배열.문제;

import java.util.Arrays;

// 시험 문제 고대로 나옴.
public class Test_2_8_시험 {
    public static void main(String[] args) {
        /*
        간단한 로또 번호 생성기
        */

        int[] lotto = new int[6];

        for(int i = 0 ; i < lotto.length ; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
        }

        System.out.println(Arrays.toString(lotto));

        // 1.0 < = x <= 46.0 실수 !
        int r = (int)(Math.random() * 45 + 1);

    }
}
