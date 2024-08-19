package object;

public class String_2 {
    public static void main(String[] args) {
        // String 객체 생성 방법에 따른 차이점
        String name1 = "java";
        String name2 = "java";
        // 위는 생성하면 똑같은 문자 그대로 쓰라고 하는 것
        String name3 = new String("java");
        String name4 = new String("java");
        // 새로운 객체를 각각 따로 만든 것

        // "==" : 숫자(정수,실수)에 사용하면 두 숫자가 같은 숫자인가?(비교)
        //      : 숫자를 제외한 나머지 자료형에서는
        //      : 두 자료가 같은 객체입니까? 라고 해석
        if(name1 == name2){
            System.out.println(1);
        }

        if(name3 == name4){
            System.out.println(2);
        }
    }
}
