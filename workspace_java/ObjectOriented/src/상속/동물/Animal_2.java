package 상속.동물;

public class Animal_2 {
    public static void main(String[] args) {

        Animal[] animalHouse = new Animal[10];
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();

        animalHouse[0] = dog1;
        animalHouse[1] = cat1;
        animalHouse[2] = cow1;
        animalHouse[3] = cow1;
        // Animal 클래스의 변수,메소드 사용 가능
        // Dog 클래스의 변수, 메소드 사용 불가

        for(int i = 0 ; i < 4 ; i++){
            animalHouse[i].bark();
        }

    }
}
