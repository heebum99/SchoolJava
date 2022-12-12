package Part9;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 스윙 프레임 만들기"); //프레임 타이틀 
        setSize(300, 300); //프레임 크기
        setVisible(true); //프레임 출력 설정
    }

    public static void main(String[] args) {
        new MyFrame(); //객체 생성시 프레임 생성
    }
}
