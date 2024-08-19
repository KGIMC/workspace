package collection.list;

public class Student_1 {
    private String name;
    private int age;
    private int score;

    // 매개변수 생성자
    public Student_1(String name, int age, int score) {
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


    // toString Override
    @Override
    public String toString() {
        return "Student_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
