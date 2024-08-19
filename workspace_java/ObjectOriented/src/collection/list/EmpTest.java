package collection.list;

public class EmpTest {
    public static void main(String[] args) {
        EmpService empService = new EmpService();

        empService.login();
        empService.printDeptMoney();
        empService.increaseMoney();
    }
}
