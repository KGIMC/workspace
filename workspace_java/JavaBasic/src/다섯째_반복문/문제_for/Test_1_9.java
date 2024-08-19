package 다섯째_반복문.문제_for;

public class Test_1_9 {
    public static void main(String[] args) {
        // 1 ~ 10까지의 합을 구하여라.
        // 1 ~ 10까지의 합을 저장할 곳이 필요함.

        int sum = 0;

        for(int i = 1; i < 11; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
