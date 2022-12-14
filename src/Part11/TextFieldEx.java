package Part11;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx() {
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));

        c.add(new JLabel("이름"));
        c.add(new JTextField(20)); //창의 열 개수(크기) 20
        c.add(new JLabel("학과"));
        c.add(new JTextField("컴퓨터공학과", 20)); //입력창을 컴퓨터공학과로 초기화, 크기는 20
        c.add(new JLabel("주소"));
        c.add(new JTextField("서울시 ...", 20));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
