package Part11;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    public ButtonEx() {
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); //포통 상태에 있을 때 출력되는 디폴트 이미지
        ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif"); //마우스가 올라가 있을 때 출력되는 이미지
        ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif"); //마우스가 눌렸을 때 출력되는 이미지

        JButton btn = new JButton("call", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);
        c.add(btn);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
