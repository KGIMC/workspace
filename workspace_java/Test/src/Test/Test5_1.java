package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제 1~9까지의 숫자가 중복 없이 저장
        int[] baseball = new int[3];

        for(int i = 0; i < baseball.length ; i++){
            // 베이스볼 배열에 넣은 랜덤한 수 생성
            int rand = (int)(Math.random() * 9 + 1);
            // 생성한 랜덤한 수 배열에 넣기
            baseball[i] = rand;

            // 배열 수 중복 검사하기
            for(int j = 0 ; j < i; j++){
               if(baseball[j] == baseball[i]){ // 중복 데이터가 있으면..
                   i--;
                   break;
                }
            }
        }

        // 대답하는 배열
        int[] answer = new int[3];

        System.out.println(Arrays.toString(baseball));
        System.out.println("게임을 시작합니다.");

        // 답을 맞출때까지 해야해서 무한 루프
        int tryCnt = 0;
        while(true){
            tryCnt++;
            System.out.print(tryCnt + " >> " + " ");

            answer[0] = sc.nextInt();
            answer[1] = sc.nextInt();
            answer[2] = sc.nextInt();

            // 정답 대조
            // baseball = [ 5, 1, 2 ]
            // answer = [ 5, 2, 3 ]
            int strike = 0;
            int ball = 0;
            for(int i = 0 ; i < baseball.length ; i++){
                for(int j = 0 ; j < answer.length ; j++){
                    if(baseball[i] == answer[j] && i == j){
                        strike++;
                    } else if(baseball[i] == answer[j]){
                        ball++;
                    }
                }
            }
            System.out.println(strike + "S" + " " + ball + "B");

            if(strike == 3){
                break;
            }

        }
        System.out.println(tryCnt + "회만에 맞췄습니다.");

    }
}
