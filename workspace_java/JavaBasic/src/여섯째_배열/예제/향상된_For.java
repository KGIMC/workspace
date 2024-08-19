package 여섯째_배열.예제;

public class 향상된_For {
    public static void main(String[] args) {
        // for-each문 : 배열에서 값을 읽을 때 사용

        int[] arr1 = {3, 7, 10, 5, 1};
        // 정수를 5개 가진 배열

        for(int i = 0; i < arr1.length ; i++){
            System.out.print(arr1[i]);
        }

        System.out.println();

        for(int e : arr1){
            // 왼쪽, 오른쪽 중에서 오른쪽부터 해석
            // 왼쪽항 : 배열에서 데이터를 하나씩 차례로 빼서 저장할 변수
            // 오른쪽항 : 반복할 배열
            System.out.print(e);
        }

        System.out.println();

        double[] arr2 = {1.1, 2.2, 3.3};
        for(double each : arr2){
            System.out.print(each + " ");
        }

        System.out.println();

        String[] arr3 = {"a", "b", "c", "d"};
        for(String e : arr3){
            System.out.print(e + " ");
        }

    }
}
