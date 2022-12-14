package Part11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제"); //setTitle()과 같은 기능
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton("   Disabled Button   ");
        JButton b3 = new JButton("getX(), getY()");

        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.MAGENTA);
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        b2.setEnabled(false); //버튼 비활성화
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
                frame.setTitle(b.getX() + "," + b.getY());
                //JComponentEx.this.setTitle(b.getX() + "," + b.getY()); 과 같은 의미
            }
        });
        c.add(b1);
        c.add(b2);
        c.add(b3);

        setSize(260,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}
