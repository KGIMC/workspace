package 다섯째_반복문.문제_for;

public class Test_1_13 {
    public static void main(String[] args) {
        // 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
        // 5의 배수인 수의 개수도 출력

        // 배수 저장할 공간
        int cnt = 0;

        //
        for(int i = 1 ; i < 101 ; i++){ // 1~100까지 증가 확인
            if(i % 5 == 0){
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println("5의 배수 개수" + cnt);
    }
}