package Static;

// static : 멤버변수, 메소드에서 사용 가능
// 공용변수, 공용메소드를 의미
// static이 붙은 변수, 메소드는 공용으로 사용 가능 !!!!!!!
public class Cnt {
    static int num = 0;

    public Cnt(){
        num++;
        System.out.println(num);
    }
}
