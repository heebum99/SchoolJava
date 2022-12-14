package Part11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventEx extends JFrame {
    private JRadioButton[] radio = new JRadioButton[3]; //라디오 버튼 배열
    private String[] text = {"사과", "배", "체리"}; //라디오버튼의 문자열
    private ImageIcon[] image = { //이미지 객체 배열
            new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/pear.jpg"),
            new ImageIcon("images/cherry.jpg")
    };
    private JLabel imageLabel = new JLabel(); //이미지가 출력될 레이블

    public RadioButtonItemEventEx() {
        setTitle("라디오버튼 Item Event 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel(); //라디오 버튼을 부착할 패널 생성
        radioPanel.setBackground(Color.gray);

        ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
        for (int i = 0; i < radio.length; i++) { //각 라디오 버튼에 대해서
            radio[i] = new JRadioButton(text[i]); //라디오 버튼 생성
            g.add(radio[i]); //버튼 그룹에 부착
            radioPanel.add(radio[i]); //패널에 부착
            radio[i].addItemListener(new MyItemListener());
        }

        radio[2].setSelected(true); //체리 라디오버튼을 선택 상태로 설정
        c.add(radioPanel, BorderLayout.NORTH); //컨텐트팬의 NORTH에 라디오패널 부착
        c.add(imageLabel, BorderLayout.CENTER); //컨텐트팬의 CENTER에 이미지 레이블 부착
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER); //이미지의 중앙 정렬

        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonItemEventEx();
    }

    class MyItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) { //라디오버튼의 선택 상태가 바뀌었을때 호출, 라디오버튼의 경우 하나를 선택시 2개의 이벤트가 발생
            if (e.getStateChange() == ItemEvent.DESELECTED) { //버튼이 선택 해제되었을 경우
                return; //아무런 변화x
            } else { //버튼이 선택되었을 경우
                if (radio[0].isSelected()) {
                    imageLabel.setIcon(image[0]);
                } else if (radio[1].isSelected()) {
                    imageLabel.setIcon(image[1]);
                } else {
                    imageLabel.setIcon(image[2]);
                }
            }
        }


    }
}
