package object;

public class Person {
    String name;
    int age;



    // 부모클래스의 메소드를 오버라이딩 하고 있는 것
    // 오버라이딩이 되려면 메소드명 일치, 매개변수 정보 일치, 리턴 타입 일치
    @Override
    public boolean equals(Object obj) { // Ojbect obj = p2; (p2는 사람이라 들어올 수 있지만, 이름 나이 모름 )


        if(name.equals( ((Person)obj).name ) && age == ((Person)obj).age ){
            return true;
        }
        else{
            return false;
        }



    }
    //toString() 오버라이딩
    //객체를 문자열로 표현 -> 모든 멤버변수의 값을 문자열로 표현

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        }
    }
