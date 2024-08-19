package 여섯째_배열.예제;

public class 배열_3 {
    public static void main(String[] args) {
        // 정수를 5개 저장할 수 있는 배열 arr1 생성
        int[] arr1 = new int[5];
//        System.out.println(arr1[0]); // 이상한 값 나옴
//        System.out.println(arr1[5]); // 값 안나옴. 주의!

        // arr1 요소값 0~4까지 출력
        for(int i = 0; i < arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // 배열의 크기
        int[] arr2 = new int[2];
        int[] arr3 = new int[5];
        int[] arr4 = new int[10];

        // 배열명.length를 사용하면 배열의 크기를 알려줌
        System.out.println(arr4.length);
    }
}
