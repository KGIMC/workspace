package 다섯째_반복문.문제_while;

public class Test_1_9 {
    public static void main(String[] args) {
        // 1~10까지의 합

        int i = 1;
        int sum = 0;

        while(i < 11){
            // 1부터 5까지의 합
            // 1부터 5까지의 합을 저장할 공간이 필요함 ( 그걸 sum으로 선언해줌 )
            // 1부터 저장하면서 그 값을 계속 쌓으면서 저장
            sum += i;
            // sum += i; / sum = sum + i;와 같은 말
            i++;
        }
        System.out.println(sum);
    }
}
