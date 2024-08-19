package Interface.student;

import class_basic.stu_manage.Stu;

// 1. 아래 요구에 맞는 추상메소드 정의
// 2. 완성한 인터페이스를 구현할 클래스 생성(MyStudent)
// 3. MyStudent 클래스에서 인터페이스의 메소드를 구현
public interface StudentUtil {

    // 첫번째 메소드
    // 메소드명 : getGradeByStudentName
    // 첫번째 매개변수로 받은 다수의 학생 중
    // 두번째 매개변수로 받은 이름을 가진 학생의 점수 등급을 리턴
    // 단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급없음"이 된다
    // 점수 등급
    // 90 <= 평균점수 <= 100 : A
    // 80 <= 평균점수 <= 89 : B
    // 70 <= 평균점수 <= 79 : A
    // 70 > 평균점수 : D

    // 학생 - student를 의미 : 다수이기에 배열로 만들어줌. - 첫번째 매개변수
    // 두번째 매개변수 - 이름을 가진 학생의 점수
    String getGradeByStudentName(Student[] students, String name);



    // 두번째 메소드
    // 메소드명은 : getTotalScoresToArray
    // 매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    // 다수의 학생 - 이름, 점수 다 가져오기 위한 배열 - student
    // 총점 -> student 클래스의 점수가 int로 설정되어있음.
    int[] getTotalScoresToArray(Student[] students);



    // 세번째 메소드
    // 메소드명 : getHighScoreStudent
    // 매개변수로 두명의 학생이 전달된다.
    // 전달된 두 학생 중 총점이 높은 학생 객체를 리턴
    // 단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정
    // 두명의 학생 < 무조건 2명
    Student getHighScoreStudent(Student stu1, Student stu2);



}
