package 다섯째_반복문.문제_for;

public class Test_1_11 {
    public static void main(String[] args) {

        // 1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하여라.
        // 배수의 개수 저장할 공간 필요

        int cnt = 0;

        for(int i = 1; i < 101; i++){
            if(i % 3 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
