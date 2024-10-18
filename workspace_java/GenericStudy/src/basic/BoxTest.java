package basic;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxTest {
    public static void main(String[] args) {
        // Box 객체 생성
        // Generic 문법이 적용된 클래스는 클래스 구현 시에는 자료형을 지정하지 않음.
        // Generic 문법이 적용된 클래스의 자료형은 객체 생성 시 결정해야함.
        Box<String> box1 = new Box<>();
        box1.setData("java");
        String data1 = box1.getData();

        Box<Integer> box2 = new Box<>();
        box2.setData(1);

        Box<Apple> box3 = new Box<>();
        box3.setData(new Apple());

        Apple data3 = box3.getData();

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();


        // 상한 제한(extends / set 하지말란 뜻 )
        // 하한 제한(super / get 하지말란 뜻 )

        // 사용의 적절한 예시
        // 매개변수로 두 개의 상자를 받고
        // A 상자의 데이터를 B 상자에 옮기는 기능

        // 와일드 카드의 최초 목적 :: 여러 자료형을 전달받기 위해서 ( 유동적으로 자료형을 바꾸기 위해 )

    }
}
