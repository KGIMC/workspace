package Static;

// 예금
public class Account {
    String accNum; // 계좌번호
    int money; // 예금액
    static double iyul; // 이율

    static{
        iyul = 7.0;
    }

    public Account(String accNum, int money){
        this.accNum = accNum;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", money=" + money +
                ", iyul=" + iyul +
                '}';
    }
}
