package class_basic.calc;

public class Calculator {
    private int num1;
    private int num2;

    // num1, num2 값을 변경하는 메소드
    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum(){
        return num1 + num2;
    }

    public int getSub(){
        return num1 - num2;
    }

    public int getMulti(){
        return num1 * num2;
    }

    public double getDiv(){
        return num1 / (double)num2;
    }
}
