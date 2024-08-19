package class_basic.student;

public class Student {

    String name;
    int age;
    int score;

    // 매개변수로 전달된 문자열로 name값을 변경하는 메소드
    public void setName(String name1){
        name = name1;
    }

    // 나이를 변경하는 메소드
    public void setAge(int age1){
        age = age1;
    }

    // 기능은 메소드로 만듬.
    public void introduce(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }
}
