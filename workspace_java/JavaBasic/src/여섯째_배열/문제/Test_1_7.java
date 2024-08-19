package 여섯째_배열.문제;

import jdk.swing.interop.SwingInterOpUtils;

public class Test_1_7 {
    public static void main(String[] args) {
        // 정수를 10개 저장할 수 있는
        // 배열을 생성하고 모든 요소에 3을 넣어라.
        // 그리고 3이 잘 들어갔는지 출력하여 확인해보아라


        // 배열 선언, 생성
        int[] arr1 = new int[10];//0 0 0 0 0 0 0 0 0...

        // 모든 요소에 3을 저장
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = 3;
        }
        // 모든 요소를 출력
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }



    }
}
