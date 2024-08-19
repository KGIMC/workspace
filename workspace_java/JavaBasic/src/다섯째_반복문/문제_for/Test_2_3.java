package 다섯째_반복문.문제_for;

public class Test_2_3 {
    public static void main(String[] args) {
        // 1부터 누적해서 합을 구하다 300이
        // 최초로 넘었을 때 for문을 멈추고
        // 그때까지의 합과 마지막으로 더해진 값을 각각 출력하여라

        int sum = 0;
        int i = 0;

        for(i = 1 ; i < 100 ; i++){
            sum += i;

            if(sum > 300){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(i);

    }
}
