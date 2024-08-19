package test;

public class Test3 {
    public static void main(String[] args) {

        int[] arr = {5, 11, 20, 40, 30};

        int max = arr[0]; // 5
        int min = arr[0]; // 5

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("가장 큰 값: " + max);
        System.out.println("가장 작은 값: " + min);
    }
}
