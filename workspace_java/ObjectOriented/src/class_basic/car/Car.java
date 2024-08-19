package class_basic.car;

public class Car {
    // 제조사, 차이름, 차량번호, 가격, 소유주의 속성
    String brand;
    String modelName;
    String carNumber; // 연산이 필요없는 경우 String 사용
    int price;
    String owner;

    public void setBrand(String brand1){
        brand = brand1;
    }

    public void setModelName(String modelName1){
        modelName = modelName1;
    }

    public void setCarNumber(String carNumber1){
        carNumber = carNumber1;
    }

    public void setPrice(int price1){
        price = price1;
    }

    public void setOwner(String owner1){
        owner = owner1;
    }

    public void printCarInto(){
        System.out.println("브랜드 : " + brand );
        System.out.println("차량이름 : " + modelName);
        System.out.println("차량번호 : " + carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }

}
