package 상속.동물;

public class Animal_1 {
    public static void main(String[] args) {
        // 강아지 5마리 저장될 공간 생성
        Dog[] dogHouse = new Dog[5];

        // 고양이 5마리 저장될 공간 생성
        Cat[] catHouse = new Cat[5];

        // 송아지 5마리 저장될 공간 생성
        Cow[] cowHouse = new Cow[5];

        // 강아지 객체 생성
        Dog d1 = new Dog();
        dogHouse[0] = d1;
        Dog d2 = new Dog();
        dogHouse[1] = d2;
        Dog d3 = new Dog();
        dogHouse[2] = d3;

        Cat c1 = new Cat();
        Cat c2 = new Cat();

        catHouse[0] = c1;
        catHouse[1] = c2;

        Cow cow1 = new Cow();
        cowHouse[0] = cow1;

//        for(int i = 0 ; i < 3 ; i++){
//            dogHouse[i].bark(); // 강아지 하우스 찾아가서 강아지 짖게하기
//        }
//
//        for(int i = 0 ; i < 2 ; i++){
//            catHouse[i].bark();
//        }
//
//        for(int i = 0 ; i < 1 ; i++){
//            cowHouse[i].bark();
//        }
    }
}
