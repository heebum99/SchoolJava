package Part5;

interface PhoneInterface { //인터페이스 선언
    final int TIMEOUT = 10000; //상수 필드

    void sendCall(); //추상 메서드

    void receiveCall();

    default void printLogo() { //default 메소드
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface { //인터페이스 구현

    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() { //추가 메소드 작성
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class 예제Q5_8 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}

