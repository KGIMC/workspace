package 네번째_조건문.예제;

/*
    switch case break


*  switch(변수){
*       case 값1 :
*       case 값2 :
*       case 값3 :
*  }
*
* */

public class Case_1 {
    public static void main(String[] args) {
        System.out.println("시작");

        int num = 10;

        switch (num){
            case 1 : // num값이 1일때 실행 내용
                System.out.println(1);
                break; // break 문을 만나면 switch문 종료
            case 3 : // num값이 3일때 실행 내용
                System.out.println(3);
                break;
            case 5 : // num값이 5일때 실행 내용
                System.out.println(5);
                break;
            case 7 : // num값이 7일때 실행 내용
                System.out.println(7);
                // 마지막 문에는 break 사용할 의미가 없음
            default: // 그 밖에 그 이외에 ( if문의 else와 동격 )
                System.out.println("해당없음");
        }

        System.out.println("종료");
    }
}
