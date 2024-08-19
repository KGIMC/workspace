package Interface.array;

public class MyArray implements MyArrayUtil{

    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        // 매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
        // 총합을 구할 변수 선언
        int sum = 0;  // arr1 배열의 합
        int sum2 = 0; // arr2 배열의 합

        //arr1 배열의 합 구하기
        for(int i = 0; i < arr1.length ; i++){
            sum = sum + arr1[i];
        }

        //arr2 배열의 합 구하기
        for(int i = 0; i < arr2.length ; i++){
            sum2 = sum2 + arr2[i];
        }

    return (sum + sum2) / (double)(arr1.length + arr2.length);
        // 앞의 sum은 총합 / 뒤의 arr은 배열의 갯수만큼
    }

    @Override
    public boolean isEvenArray(int[] array) {
        // 매개변수로 받은 배열의 모든 요소가 짝수일때만 리턴 True
        // array = {1,2,3,4,5}
        // for each 우측은 돌릴 배열
        // for each 왼쪽은 횟수
        for(int e : array){
            if(e % 2 == 1){
                return false;
            }
        }
        return true;
    }
}
