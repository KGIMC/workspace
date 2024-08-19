package Interface.student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyStudent stu = new MyStudent();

        Student[] students = new Student[5]; // 배열 만들어주기 ( 값 넣기 )
        Student s1 = new Student("김", 90, 90, 90);
        Student s2 = new Student("이", 80, 80, 80);
        Student s3 = new Student("박", 70, 70, 70);
        Student s4 = new Student("최", 70, 60, 80);
        Student s5 = new Student("강", 70, 60, 80);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        // 배열의 이름과 두번째 매개변수로 받은 이름이 같으면 해당 학생의 점수를 가져와서 등급 리턴하기
        String result = stu.getGradeByStudentName(students, "김");
        System.out.println(result);

        System.out.println();

        int[] result1 = stu.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(result1));
        // arrays < 배열과 관련된 명령어, 연관된 명령어 toString


        System.out.println();

        Student result3 = stu.getHighScoreStudent(s2, s3);
        System.out.println(result3);
    }
}
