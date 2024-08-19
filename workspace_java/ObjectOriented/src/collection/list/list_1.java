package collection.list;

import java.util.ArrayList;

public class list_1 {
    public static void main(String[] args) {
        // ArrayList = 리스트 자료 구조 클래스화
        // ArrayList 객체 생성
        // 컬렉션 프레임워크 - 다수의 데이터 관리하기 편하게 하기 위함.
        // ArrayList - String 데이터 다수를 담을 수 있는 List 공간 생성
        ArrayList<String> list1 = new ArrayList<>(); // 꺽쇠
        list1.add("java");
        list1.add("c++");
        // ArrayList - 정수 데이터 다수를 담을 수 있는 List 공간 생성
        ArrayList<Integer> list2 = new ArrayList<>(); // int 때문에 Wrapper 사용
        list2.add(1);
        list2.add(2);

        System.out.println(list1);
        System.out.println(list2);


    }
}
