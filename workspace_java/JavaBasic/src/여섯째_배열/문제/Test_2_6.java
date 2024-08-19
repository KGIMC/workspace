package 여섯째_배열.문제;

public class Test_2_6 {
    public static void main(String[] args) {
        /*1,2,3을 초기값으로 갖는 배열 arr1과
        4,5,6을 초기값으로 갖는 arr2를 만든다.
        그 후 새로운 배열 newArr을 만들어 arr1과 arr2의 모든 값을 복사해보자.
        복사 후 newArr은 1,2,3,4,5,6을 가져야 한다.*/

        // 초기값 1, 2, 3 배열
        int[] arr1 = {1, 2, 3};
        // 초기값 4, 5, 6 배열
        int[] arr2 = {4, 5, 6};
        // 1~6까지 들어갈 새로운 배열
        // 위의 배열이 바뀌어도 아래가 안 바뀌게 하려면 length(길이) 사용
        // length는 배열에 생성된 길이
        int[] newArr = new int[arr1.length + arr2.length];

        for(int i = 0 ; i < arr1.length ; i++){
            newArr[i] = arr1[i];
        }
        for(int i = 0 ; i < arr2.length ; i++){
            newArr[arr1.length+i] = arr2[i];
        }

        for(int e : newArr){
            System.out.print(e + " ");
        }
    }
}
