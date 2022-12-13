package Part10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickAndDoubleClickEx extends JFrame {
    public ClickAndDoubleClickEx() {
        setTitle("Click and DoubleClick 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickAndDoubleClickEx();
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) { //더블클릭인 경우
                //[0,255] 사이의 랜덤한 r,g,b 정수 얻기
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);

                Component c = (Component) e.getSource(); //마우스로 클릭한 컴포넌트를 알아내기
                c.setBackground(new Color(r, g, b)); //컴포넌트 배경을 r,g,b 색으로 칠한다.
            }
        }
    }
}
