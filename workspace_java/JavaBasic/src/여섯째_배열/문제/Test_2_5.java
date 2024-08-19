package 여섯째_배열.문제;

public class Test_2_5 {
    public static void main(String[] args) {
        /*
        초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
        그리고 길이가 5인 새로운 정수형 배열 newArr을 만든 후
        arr이 가진 값을 newArr로 복사하여 보자.
        복사 결과는 출력을 통해 확인한다.
        */

        // 초기값 5,4,3,2,1 지정
        int[] arr1 = {7, 4, 3, 2, 1};
        // 길이 5인 새로우 정수형 배열
        int[] newArr = new int[5];

        for(int i = 0 ; i < arr1.length ; i++){
            newArr[i] = arr1[i];
        }

        for(int e : newArr){
            System.out.print(e + " ");
        }




    }
}
