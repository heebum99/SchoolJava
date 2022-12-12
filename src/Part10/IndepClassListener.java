package Part10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); //버튼 컴포넌트에 Action 이벤트 리스너 달기
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

//독립된 클래스로 이벤트 리스너 작성
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource(); //이벤트 소스 버튼을 알아내기
        if (b.getText().equals("Action")) {
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }
}
