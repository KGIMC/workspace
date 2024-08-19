package 다섯째_반복문.문제_for;

public class Test_2_1 {
    public static void main(String[] args) {
        // 1 이상 100 미만의 정수 중에서
        // 7의 배수와 9의 배수를 출력하는 프로그램
        // 7, 9의 동시 배수는 한번만 출력

        for(int i = 1 ; i < 100 ; i++){
            if(i % 7 == 0 || i % 9 == 0){
                System.out.println(i);
            }
        }
    }
}
