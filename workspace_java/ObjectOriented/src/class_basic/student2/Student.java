package class_basic.student2;

public class Student {
    private String name;
    private int age;
    private int score;

    // 멤버변수를 받아 모든 매개변수의 값을 변경하는 생성자


    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    // 모든 멤버변수를 출력하는 메소드
    public void print(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }
}
