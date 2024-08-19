package 상속.클래스테스트;

class A{
    private int x;
    private int y;

    public A(){
        x = 1;
        y = 1;
    }

    public A(int x){
        this.x = x;
        y = 1;
    }

    public A(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void disp(){
        System.out.print("x = " + x + ", " + "y = " + y + ", ");
    }
}

class B extends A{
    // 본인한테 선언한 x,y와 부모한테 물려받은 x,y
    private int x;
    private int y;

    public B(){ // 변수값 초기화
        // 초기화할 값 없음.
        // x,y값 기본적으로 1로 바꿔야함.
        x = 1;
        y = 1;

    }

    public B(int x){
        // 부모 클래스의 x값을 변경
        super(x);
        this.x = 1;
        y = 1;
    }

    public B(int x, int y){
        super(x, y);
        this.x = 1;
        this.y = 1;
    }


    public void disp(){
        super.disp();
        System.out.println("x = " + x + ", " + "y = " + y);
    }
}

public class Work {

    public static void main(String[] args) {
        B bp = new B();
        B bp1 = new B(10);
        B bp2 = new B(10, 20);
//        B bp3 = new B(10, 20, 30);
//        B bp4 = new B(10, 20, 30, 40);



        bp.disp(); // x1, y1, x1, y1
        bp1.disp(); // x10, y1, x1, y1
        bp2.disp(); // x10, y20, x1, y1
//        bp3.disp(); // x10, y20, x30, y1
//        bp4.disp(); // x10, y20, x30, y40
    }
}


