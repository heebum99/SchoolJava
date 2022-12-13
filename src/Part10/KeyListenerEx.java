package Part10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    private JLabel[] keyMessage; //3개의 메시지를 출력할 레이블 컴포넌트 배열

    public KeyListenerEx() {
        setTitle("keyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getKeyText() ");

        for (int i = 0; i < keyMessage.length; i++) {
            c.add(keyMessage[i]);
            keyMessage[i].setOpaque(true); //배경색이 보이도록 투명하게 설정
            keyMessage[i].setBackground(Color.YELLOW);
        }

        setSize(300, 150);
        setVisible(true);

        //컨텐트팬이 키 입력을 받을 수 있도록 포커스 지정
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode(); //눌린 키의 코드 알아내기
            char keyChar = e.getKeyChar(); //눌린 키의 문자 값 알아내기
            keyMessage[0].setText(Integer.toString(keyCode)); //키 코드 출력
            keyMessage[1].setText(Character.toString(keyChar)); //키 문자 출력
            keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); //키 이름 문자열 출력

            System.out.println("KeyPressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("KeyReleased");
        }

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("KeyTyped");
        }
    }
}
