package Part10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//마우스 좌클릭시 배경색을 빨간색으로 우클릭 시 파란색으로 바꾸는 프로그램

public class But extends JFrame {
    private JButton btn = new JButton("버튼");
    public But() {
        setTitle("Left Click and Right Click");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(btn);
        c.addMouseListener(new MyMouseListener());

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new But();
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) { //좌클릭을 했을 경우
                btn.setBackground(Color.RED);
            } else if (e.getButton() == MouseEvent.BUTTON3) { //우클릭을 했을 경우
                btn.setBackground(Color.BLUE);
            }
        }
    }
}
