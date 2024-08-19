package 상속.맨;

public class ManTest {
    public static void main(String[] args) {
        BusinessMan bm = new BusinessMan();
        System.out.println(bm.company);
        bm.tellCompany();

        System.out.println(bm.name);
        bm.tellName();
    }
}
