package 다섯째_반복문.문제_while;

public class Test_1_13 {
    public static void main(String[] args) {


        int i = 1;
        int cnt = 0;

        while(i < 101){
            if(i % 5 == 0){
                cnt++;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.print("5의 배수의 개수 : " + cnt);
    }
}
