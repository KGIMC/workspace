import java.util.HashMap;
import java.util.Map;

public class Map_2 {
    public static void main(String[] args) {
        // 학생 객체 3명 생성 후
        Student s1 = new Student(1, "김자바");
        Student s2 = new Student(2, "이자바");
        Student s3 = new Student(3, "최자바");


        // 3명의 학생을 맵에 저장하기
        Map<Integer, Student> stuMap = new HashMap<>();


        // 이때 키는 각 학생의 학번으로 저장
        stuMap.put(s1.getStuNum(), s1);
        stuMap.put(s2.getStuNum(), s2);
        stuMap.put(s3.getStuNum(), s3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // 키가 2번인 학생의 학생 이름 출력
        stuMap.get(2).getStuName();

        System.out.println(stuMap.get(2).getStuName());
    }
}
