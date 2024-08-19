package 네번째_조건문.예제;

public class If_4 {
    public static void main(String[] args) {
        int x1 = 5;

        // 첫번째 예시
            if(x1 > 3){
                System.out.println(1);
            }
            if(x1 == 5){
                System.out.println(2);
            }
            if(x1 < 10){
                System.out.println(3);
            }
        // if문만 쓰면 모든 결과 출력

        // 두번째 예시
            if(x1 > 3){
                System.out.println(1);
            }
            else if(x1 == 5){
                System.out.println(2);
            }
            else if(x1 < 10){
                System.out.println(3);
            }
        // else if는 출력 안됨 ( 맨 위의 if가 참이면 )

    }
}
