package 여섯째_배열.문제;

public class Test_3_1 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        // 작성 위치
        // 큰 수를 비교하기 위해 for문을 사용
        // max에는 배열의 값을 순차적으로 비교
        for(int i = 0 ; i < array.length ; i++){
            if(max < array[i]){
                // max값이 array값보다 작으면
                max = array[i];
                // max값은 array값으로 교체
            }
        }

        System.out.println("max : " + max);
    }
}
