package class_basic.man;

// setter : 멤버변수 각각의 값을 변경하는 메소드
// setter의 이름은 set변수명으로 지정

// 이름, 나이, 주소 리턴하는 메소드
// getter : 멤버변수 각각의 값을 받아오는 메소드
// getter의 이름은 get변수명으로 지정

public class Man {

    private String name;
    private int age;
    private String addr;

    public Man(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void printMan(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }

}
