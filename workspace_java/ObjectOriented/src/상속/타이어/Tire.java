package 상속.타이어;

public class Tire {
    public void run(){
        System.out.println("일반 타이어가 굴러감");
    }
}

class SnowTire extends Tire{
    public void run(){
        System.out.println("스노우 타이어가 굴러감");
    }
}
