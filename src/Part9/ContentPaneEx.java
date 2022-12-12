package Part9;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임을 닫으면 프로그램이 종료되도록 설정

        Container contentPane = getContentPane(); //프레임에 자동으로 부착된 컨텐트 팬을 알아낸다.
        contentPane.setBackground(Color.ORANGE); //컨텐트팬의 색을 오렌지 색으로 설정
        contentPane.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 달기

        contentPane.add(new JButton("OK")); //OK버튼 달기
        contentPane.add(new JButton("Cancel")); //Cancel버튼 달기
        contentPane.add(new JButton("Ignore")); //Ignore버튼 달기

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
