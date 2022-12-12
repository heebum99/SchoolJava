package Part10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    public InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
            } else {
                b.setText("Action");
            }
            //InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음.
            InnerClassListener.this.setTitle(b.getText()); //프레임의 타이틀에 버튼 문자열을 출력
        }


    }
}
