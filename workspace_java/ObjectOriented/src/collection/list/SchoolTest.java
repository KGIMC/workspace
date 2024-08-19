package collection.list;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {

        // 자바반에 소속될 학생 3명 ( 각 교실에 학생 3명 )
        Student_1 s1 = new Student_1("김자바", 20, 80);
        Student_1 s2 = new Student_1("이자바", 30, 90);
        Student_1 s3 = new Student_1("최자바", 40, 100);

        // 자바반 // 배열은 다이렉트로 못 넣음.
        // 학생 목록을 만들어주고 넣어야함.

        // 자바반에 저장될 학생 리스트 만들기
        List<Student_1> stuList1 = new ArrayList<>();
        StudyClass javaClass = new StudyClass("자바반", "강사_자바", stuList1);
        // 교실 만들고 거기에 기존에 만들었던 학생 추가하기
        stuList1.add(s1);
        stuList1.add(s2);
        stuList1.add(s3);

        // 캐드반에 저장될 학생 3명
        Student_1 s4 = new Student_1("김캐드", 25, 75);
        Student_1 s5 = new Student_1("이캐드", 35, 85);
        Student_1 s6 = new Student_1("최캐드", 45, 95);
        // 캐드반 학생들이 저장될 List 생성 및 해당 List에 캐드반 학생 저장

        List<Student_1> stuList2 = new ArrayList<>();
        StudyClass cadClass = new StudyClass("캐드반", "캐드_강사", stuList2);
        stuList2.add(s4);
        stuList2.add(s5);
        stuList2.add(s6);


        // 명상반에 저장될 학생 3명
        Student_1 s7 = new Student_1("김명상", 27, 77);
        Student_1 s8 = new Student_1("이명상", 37, 87);
        Student_1 s9 = new Student_1("최명상", 47, 97);

        // 명상반 학생들이 저장될 List 생성 및 해당 List에 캐드반 학생 저장
        List<Student_1> stuList3 = new ArrayList<>();
        StudyClass msClass = new StudyClass("명상반", "명상_강사", stuList3);
        stuList3.add(s7);
        stuList3.add(s8);
        stuList3.add(s9);

        // 교실을 여러개 저장할 리스트
        List<StudyClass> classList = new ArrayList<>();
        classList.add(javaClass);
        classList.add(cadClass);
        classList.add(msClass);



        School school = new School(classList); // 학교를 만듦

        // 학교 안의 모든 학생의 정보 출력

        for(int i = 0 ; i < school.getClassList().size(); i++){
            // 학교 안에 있는 반 중에서 0번째 학생에게 접근
            for(int j = 0 ; j < school.getClassList().get(i).getStuList().size(); j++){
                System.out.println(j);
            }
        }



    }
}
