package collection.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("kim", 70, 80);
        Student s2 = new Student("lee", 60, 70);
        Student s3 = new Student("park", 50, 60);
        // 학생 정보 만들기 ( 위는 3개 )

        // 학생 정보 저장할 리스트 만들기
        List<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        // add 명령어로 학생 정보 추가

        // 리스트의 모든 정보 출력
        for (Student stu : stuList) {
            System.out.println(stu);
        }

        System.out.println();

        // 총점이 150점 이상인 학생의 모든 정보 출력

        for(int i = 0 ; i < stuList.size(); i++){
            if(stuList.get(i).getTotalScore() >= 150){
                System.out.println(stuList.get(i));
            }
        }

        System.out.println();

        // 모든 학생에 대한 총점에 대한 평균 점수 출력
        int sum = 0;
        for(Student stu : stuList){
            sum = stu.getTotalScore();
        }
        System.out.println((double)sum/stuList.size());

        System.out.println();


        // 총점의 1등인 학생의 모든 정보 출력
        int index = 0; // 총점이 1등인 학생의 index(정보?)
        int max = 0; // 총점
        for(int i = 0 ; i < stuList.size(); i++){
            if(max < stuList.get(i).getTotalScore()){
                max = stuList.get(i).getTotalScore();
                index = i;
            }
        }
        System.out.println(stuList.get(index));
    }
}
