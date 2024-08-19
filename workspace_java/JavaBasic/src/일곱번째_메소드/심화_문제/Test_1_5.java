package 일곱번째_메소드.심화_문제;

public class Test_1_5 {
    // 정수형 배열을 매개변수로 받아
    // 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        test(a);

    }

    public static void test(int[] arr){
        for(int i = 0 ; i < arr.length; i++){ // int[] arr = a;
            System.out.println(arr[i]);
        }
    }
}
