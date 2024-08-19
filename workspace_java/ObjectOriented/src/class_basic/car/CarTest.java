package class_basic.car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.print(c1.brand + " ");
        System.out.print(c1.modelName + " ");
        System.out.print(c1.carNumber + " ");
        System.out.print(c1.price + " ");
        System.out.print(c1.owner);
        System.out.println();

        Car c2 = new Car();
        c2.printCarInto();
        System.out.println();

        c2.setBrand("기아");
        c2.setModelName("K3");
        c2.setCarNumber("7777");
        c2.setPrice(1000000);
        c2.setOwner("");
        c2.printCarInto();



    }


}
