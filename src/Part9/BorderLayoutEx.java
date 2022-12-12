package Part9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        //BorderLayout 배치관리자에 좌우 30 상하 20 간격을 주고 만들기
        c.setLayout(new BorderLayout(30, 20));
        c.add(new JButton("Calculate"), BorderLayout.CENTER); //Calculate 버튼을 중앙에 배치
        c.add(new JButton("add"), BorderLayout.NORTH); //add 버튼을 위쪽에 배치
        c.add(new JButton("sub"), BorderLayout.SOUTH); //sub 버튼을 아래쪽에 배치
        c.add(new JButton("mul"), BorderLayout.EAST); //mul 버튼을 오른쪽에 배치
        c.add(new JButton("div"), BorderLayout.WEST); //div 버튼을 왼쪽에 배치

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
