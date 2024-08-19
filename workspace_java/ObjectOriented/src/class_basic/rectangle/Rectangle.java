package class_basic.rectangle;

public class Rectangle {

    // 사각형을 구성하는 점의 좌표
    int x1;
    int y1;
    int x2;
    int y2;

    // 생성자
    public Rectangle(){
        // 매개변수가 하나라도 만들면 기본 생성자를 생성해줘야함.
    }

    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int sqaure(){
        return (x2 - x1) * (y2 - y1);
    }

    // 좌표 정보, 넓이 출력
    // (1,2), (5,7)
    public void show(){
        System.out.println("(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
        System.out.println("사각형의 넓이 : " + sqaure());
    }

    // 인자로 전달된 객체 r과 한 객체가 같은 넓이라면 리턴 트루
    public boolean equals(Rectangle r){
        if(r.sqaure() == sqaure()){
           return true;
        }
        else{
            return false;
        }
    }

}
