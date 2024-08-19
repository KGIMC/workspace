package collection.list;

import java.util.List;

public class StudyClass {
    private String className;
    private String teacher;
//    private Student_1 stu; < 교실에 학생이 한명인 경우는 좌측과 같이 생성하면 됨.
    private List<Student_1> stuList; // < 학생이 여러명인 경우 // 배열대신 리스트로 만들라해서 리스트로 만듬.


    public List<Student_1> getStuList(){
        // 학생 목록을 받아오겠다.
        return stuList;
    }


    // 생성자 및 매개변수 만들기
    public StudyClass(String className, String teacher, List<Student_1> stuList){
        this.className = className;
        this.teacher = teacher;
        this.stuList = stuList;

    }


/*   2) 해당 반의 평균 성적을 리턴하는 기능
     3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능  */

    // 1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    public void printStuAll(){
        // 학생이 여러명 있다고 가정하고 문제를 풀어도 됨.
        for(Student_1 stu : stuList){
            System.out.println(stu);
        }

    }
}
