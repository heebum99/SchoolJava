package Part11;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("라디오버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

        ButtonGroup g = new ButtonGroup(); //라디오 버튼을 묶을 버튼 그룹 객체 생성
        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리", cherryIcon);

        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        //버튼 그룹에 라디오 버튼 등록
        g.add(apple);
        g.add(pear);
        g.add(cherry);

        //컨텐트팬에 라디오 버튼 등록
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
