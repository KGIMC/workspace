package 상속.클래스테스트;

public class SuperCls {
    public SuperCls(int a){

    }
    public SuperCls(String a, int b){

    }

}

class SubCls extends SuperCls{
    public SubCls(){
        super("null", 0);
    }

}