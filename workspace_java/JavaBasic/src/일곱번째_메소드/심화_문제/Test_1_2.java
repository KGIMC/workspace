package 일곱번째_메소드.심화_문제;

public class Test_1_2 {
    // 정수 하나를 매개변수로 받아,
    // 1 ~ 100까지의 수 중에서 매개변수로 받은 수의
    // 배수를 출력하는 메소드를 만들고 호출해보세요.
    public static void main(String[] args) {
        test(10);
    }

    public static void test(int a){
        // 1 ~ 100은 이미 정해져있음 (?)
        int sum = 0;
        // sum 매개 변수에 지정된 정수값을 계속 더해감.
        for(int i = 0 ; i < 100 ; i++){
            if(i % a == 0){
                sum += a;
                // 더한 값에 또 더해서 출력
                // ex ) 2를 출력하면 맨 위로 돌아가서 i < 100에 비교하여
                // 조건에 부합하면 sum += a;에서
                // 2 = 0+2;기에 -> 2 = 2+2가 되어 4로 변경됨.
                System.out.println(sum);
                // for문 안에 있기에 위의 값을 계속 출력함.
            }
        }
    }
}
