package collection.list;

public class Emp {
    private int empNo;
    private String name;
    private String dept;
    private String tel;
    private int money;

    // 매개변수로 모든 정보 세팅하는 생성자
    public Emp(int empNo, String name, String dept, String tel, int money) {
        this.empNo = empNo;
        this.name = name;
        this.dept = dept;
        this.tel = tel;
        this.money = money;
    }

    public int getEmpNo(){
        return empNo;
    }


    // 사원의 마지막 연락처 4자리값 리턴
    public String getPw(){
        return tel.substring(5);
    }

    public String getName(){
        return name;
    }

    public String getDept(){
        return dept;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
