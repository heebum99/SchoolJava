package Part10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
    private final int FLYING_UNIT = 10;
    private JLabel la = new JLabel("HELLO");

    public FlyingTextEx() {
        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(null); //배치관리자 삭제
        c.addKeyListener(new MyKeyListener()); //키 리스너 달기
        la.setLocation(50, 50); //컴포넌트의 절대 위치 설정
        la.setSize(100, 20); //컴포넌트의 절대 크기 설정
        c.add(la); //컴포넌트 달기

        setSize(300, 300);
        setVisible(true);

        c.setFocusable(true); //컨텐트팬이 키 입력을 받을 수 있도록 포커스 지정
        c.requestFocus();
        
        c.addMouseListener(new MouseAdapter() { //컨텐트팬에 포커스를 잃은 경우 마우스가 클릭한 컴포넌트에게 포커스를 얻게 하는 코드
            public void mouseClicked(MouseEvent e) {
                Component com = (Component) e.getSource();
                com.setFocusable(true);
                com.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - FLYING_UNIT, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + FLYING_UNIT, la.getY());
                    break;
            }
        }
    }
}
