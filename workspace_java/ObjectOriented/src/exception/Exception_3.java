package exception;

// 예외전가
public class Exception_3 {
    public static void main(String[] args) {
        try{
            bbb();
        } catch(Exception e){

        }

    }

    public static void aaa() throws Exception { // throws Exception <- 예외 처리 안하고 던져버림
        System.out.println(5/0);
    }

    public static void bbb() throws Exception {
        aaa();
    }
}
