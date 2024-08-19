public class Restaurant {
    private Chef chef;

    public Restaurant(){
        chef = new Chef();
    }

    public void service(){
        System.out.println("영업을 시작합니다.");
        chef.makeCook();
    }

}
