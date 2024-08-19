package class_basic.stu_manage;

import java.util.Scanner;

public class StuManage {
    private Scanner sc; // 키보드 입력을 위해 선언
    private Stu[] Students; // 학생 다수를 저장할 배열
    private int idx; // 학생 배열의 요소 ( 몇번째 요소인지 )

    // 생성자
    public StuManage(){
        sc = new Scanner(System.in);
        Students = new Stu[3];
        idx = 0;
    }

    // 학생등록 메소드
    public void regStu(){
        if(idx >= 3){
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
        else{
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("나이 : ");
            int age = sc.nextInt();
            System.out.println("학점 : ");
            String grade = sc.next();
            System.out.println("연락처 : ");
            String tel = sc.next();
            // 입력받은 정보로 학생 객체 생성
            Stu stu = new Stu(name, age, grade, tel);
            // 생성한 학생 객체를 배열에 저장
            Students[0] = stu;
            idx++;
        }
    }
    // 학생정보변경 메소드
    public void changeInfo(){
        System.out.println("정보변경실행");
    }
    // 학생정보출력 메소드
    public void print(){
        System.out.println("요청하신 학생의 정보입니다.");
        // 입력한 학생 중 필요한 학생의 정보만 출력해야함. 비교?


    }

    public void printAll(){
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + idx + "명입니다.");

        for(int i = 0 ; i < idx ; i++){
            Students[i].showInfo();
            System.out.println();
        }
    }
}
