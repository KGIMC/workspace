package class_basic.student;

public class StudentTest {
    public static void main(String[] args) {
        // class에서 만든 기능을 실행시키는 공간

        // 학생 객체 stu1 생성
        Student stu1 = new Student();

        // stu1 이라는 학생의 이름을 출력
        System.out.println(stu1.name);

        // stu1 이라는 학생의 모든 정보 출력
        stu1.introduce();
        System.out.println();

        // stu1 이라는 학생의 이름을 변경해서 출력
        stu1.setName("kim");
        stu1.introduce();
        System.out.println();

        // stu1 이라는 학생의 나이를 변경해서 출력
        stu1.setAge(30);
        stu1.introduce();
    }
}
