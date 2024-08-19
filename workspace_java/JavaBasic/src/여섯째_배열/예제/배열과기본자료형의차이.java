package 여섯째_배열.예제;

public class 배열과기본자료형의차이 {
    public static void main(String[] args) {

        // 기본 자료형 int b = a; 는 a의 값을 b에 복사
        // 참조 자료형 배열은
        // int[] b = a;라 치면 같은 주소를 사용함.
        // 기본 자료형 : 8
        // 참조 자료형 : 무한
        // 기본 자료형이 이상한 놈

        int[] a = {1, 3, 5};
        int[] b = a;
        a[0] = 10;
        b[2] = 50;

        for(int e : a){
            System.out.print(e + " ");
        }

        System.out.println();

        for(int e : b){
            System.out.print(e + " ");
        }

        // 배열의 복사를 하려면 (clone) 사용
        int[] c = {1, 2, 3};
        int[] d = c.clone();
        // 값을 각각 바꾼다 쳐도 다르게 나옴.


        /*int a = 10;
        int b = a;
        a = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);*/
    }
}
