package 상속.타이어;

public class TireTest {
    public static void main(String[] args) {
        SnowTire st = new SnowTire();
        Tire t = new SnowTire();

        st.run();
        t.run();
    }
}
