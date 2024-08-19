package 일곱번째_메소드.심화_문제;

public class Test_1_7 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        String r1 = test(arr);
        System.out.println(r1);
    }
    public static String test(String[] arr){
        String r1 = "";
        for(int i = 0 ; i < arr.length ; i++){
            r1 = r1 + arr[i];
        }
        return r1;
    }

}
