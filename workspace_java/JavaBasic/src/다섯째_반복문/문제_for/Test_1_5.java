package 다섯째_반복문.문제_for;

public class Test_1_5 {
    public static void main(String[] args) {
        // 출력문을 한번만 사용하여 ‘2 4 6 8 10’을 출력하되

        for(int i = 1; i < 11; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
