package 다섯째_반복문.문제_while;

public class Test_1_11 {
    public static void main(String[] args) {

        int i = 1;
        int cnt = 0;

        // 1~100까지 차례로 반복해서 while(i < 101)
        // 해당 숫자가 3의 배수인지 확인 if(i % 3 == 0)
        while(i < 101){
            if(i % 3 == 0){
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);
    }
}
