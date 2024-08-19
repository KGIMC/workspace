package Interface;

public class LgTv implements Tv{


    @Override
    public void turnOn() {
        System.out.println("엘지티비 - 전원 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("엘지티비 - 전원 꺼짐");
    }

    @Override
    public void volumeDown() {
        System.out.println("엘지티비 - 소리 내림");
    }

    @Override
    public void volumeUp() {
        System.out.println("엘지티비 - 소리 올림");
    }
}
