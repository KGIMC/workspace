package basic;


public class Phone {
    public void call() {
        System.out.println("전화를 겁니다.");
    }
}

class mobilePhone extends Phone{
    public void sendMsg(){
        System.out.println("메세지를 전송합니다.");
    }
}

class smartPhone extends mobilePhone {
    public void playApp(){
        System.out.println("앱을 실행합니다.");
    }
}


