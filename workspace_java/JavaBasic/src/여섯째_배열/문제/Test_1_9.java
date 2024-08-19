package 여섯째_배열.문제;

public class Test_1_9 {
    public static void main(String[] args) {
        // 1,5,7을 초기값으로 저장하고 있는 배열을 만들고,
        // 배열의 모든 요소의 합을 출력해보아라.

        // 배열 초기값
        int[] arr1 = {1, 5, 7};
        // 합 고정할 변수
        int sum = 0;

        // 초기 지정값의 합 구하기
        for(int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i];
        }
        System.out.println(sum);
    }
}
