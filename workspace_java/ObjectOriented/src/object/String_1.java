package object;

public class String_1 {
    public static void main(String[] args) {
        String name2 = new String("java");

        String name1 = "java";


        // String 객체의 특이점
        String name3 = name1;
        name1 = "pthon";
        System.out.println(name1);
        System.out.println(name3);
    }



}
