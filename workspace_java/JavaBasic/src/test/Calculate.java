package test;

public class Calculate {

    private int num1;
    private int num2;
    int max = 0;

    void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int getSum(){
        return num1+num2;
    }

    int getMax(){
        if(num1 > num2){
            max = num1;
        } else if(num2 > num1){
            max = num2;
        }
        return max;
    }


    double getAvg(){
        return (num1-1)+(num2-1) /2.0;
    }
}