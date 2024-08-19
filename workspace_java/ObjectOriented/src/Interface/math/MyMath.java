package Interface.math;

public class MyMath implements MathUtil{


    @Override
    public int getMin(int a, int b) {
        return a < b ? a : b; // 삼항연산자
    }

    @Override                     // 2 * 3.14 * 반지름
    public double getCircleArea(int radius) {

        return radius < 0 ? 0 : 2 * Math.PI * radius;
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result = 1;
        for(int i = 0 ; i < n ; i++){
             result = result * num1;
        }
        return result;
    }
}
