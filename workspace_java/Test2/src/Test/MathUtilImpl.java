package Test;

public class MathUtilImpl implements MathUtil{

    @Override
    public boolean isEven(int a, int b, int c) {

        // 매개변수의 합부터 구하기
        int sum = a + b + c;
        if(sum % 2 == 0 && sum % 5 == 0){
            return true;
        } else {
            return false;
        }
    }
    // else를 빼먹음.. ㅠㅠㅠ

    @Override
    public int getSumFromOne(int num) {
        // 1부터 매개변수로 받은 수까지의 합을 리턴
        int sum = 0 ;
        for( int i = 0 ; i < num ; i++)
        // 매개변수의 합까지끼 때문에
        // num에 기호를 <=로 표시하거나 num + 1로 해야함.
            sum = sum + i;
        return sum;
    }

    // 내가 작성한 식 틀림.

    @Override
    public int getArraySum(int[] arr) {
        int sum = 0 ;
        for(int i = 0 ; i < arr.lenth ; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
