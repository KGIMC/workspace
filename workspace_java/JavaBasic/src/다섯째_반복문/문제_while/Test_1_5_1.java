package 다섯째_반복문.문제_while;

public class Test_1_5_1 {
    public static void main(String[] args) {

        // 1번 방법

        int i = 2;
        while(i < 11){
            System.out.print(i + " ");
            i = i + 2;
        }

        System.out.println();

        // 2번 방법

        int j = 2;
        while(j < 11){
            // j가 짝수일때만 출력
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
            j++;
        }
    }
}
