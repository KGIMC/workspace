package 다섯째_반복문.문제_for;

public class Test_1_5_1 {
    public static void main(String[] args) {

        // 1번 방법

        for(int i = 2; i < 11; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println();


        // 2번 방법
        for(int i = 1; i < 11; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
