package 다섯째_반복문.For;

public class For_1 {
    public static void main(String[] args) {

        // @1,2,3이 while문에서 중요
        // 그걸 한 곳으로 모아놓은 문법이 for문


        /*int i = 1; // @1
        int cnt = 0;

        while(i < 11){ // @2
            System.out.print(i + " ");
            i++; // @3
        }*/

   /*     for(int i = 1 ; i < 11 ; i++){
            // 해석 순서
            // int i = 1; -> 최초의 딱 한번만 해석
            // i < 11 ;
            // println
            // i++
            System.out.print(i);
        }*/

        // 1~10까지 합
        int sum = 0;

        for(int i = 1; i < 11; i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
