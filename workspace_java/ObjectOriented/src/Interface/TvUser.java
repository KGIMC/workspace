package Interface;

public class TvUser {
    public static void main(String[] args) {

        SamsungTv tv = new SamsungTv();
        tv.turnOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.turnOff();
    }
}
