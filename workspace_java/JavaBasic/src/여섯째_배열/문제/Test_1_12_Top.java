package 여섯째_배열.문제;

import java.util.Scanner;
// 상수를 최소화 할것
// 변수를 많이 이용할 것
public class Test_1_12_Top {
    public static void main(String[] args) {
        // 성적 처리 프로그램
        // 점수를 받기 위한 변수 선언
        Scanner sc = new Scanner(System.in);

        // 배열 - 똑같은 자료형을 받기 위한 것 ( 국어, 수학, 영어점수, 총점 ) - 평균은 실수기 때문에 미포함
        // 0 : 국어, 1:영어, 2:수학, 3:총점
        int[] scores = new int[6];  

        // 과목명을 저장할 공간
        String[] subjects = {"국어", "영어", "수학", "사회", "과학"};

        // 평균
        double avg;

        // 점수 입력
        // 0 ~ 100점만 입력 가능하도록 설정 ( 무한루프 이용 )
        for(int i = 0 ; i < scores.length-1 ; i++){
            // 항상 코드의 확장성을 고려할 것 (명심)
            while(true){
                System.out.println(subjects[i]+ "점수 : ");
                scores[i] = sc.nextInt(); // 키보드로 정수를 입력받아 score 배열의 0번째 요소에 저장
                // 0~100점을 입력받은 경우 무한 루프에서 빠져나와야함.
                if(scores[i] >= 0 && scores[i] <= 100){
                    break;
                }
            } // while문 끝나는 부분
        }

        // 총점 및 평균 계산
            // 총점 담을 변수를 선언해야하지만, 맨 위에 총점 담을 변수(배열) 같이 만들어놨기에 만들 필요가 없음.
            for(int i = 0 ; i < scores.length - 1; i++){
                scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
            }

            avg = scores[scores.length-1] / (double)(scores.length - 1);

            // 점수, 총점, 평균 출력
            System.out.println();
            System.out.println(" --- 입력한 정보입니다. ---");

            // scores.length - 1 == subjects.length
            for(int i = 0 ; i < subjects.length ; i++){
                System.out.println(subjects[i] + "점수는 : " + scores[i]);
            }
                System.out.println("총점은 : " + scores[scores.length-1]);
                System.out.println("평균은 : " + avg);

    }
}
