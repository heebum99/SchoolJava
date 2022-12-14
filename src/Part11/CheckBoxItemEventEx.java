package Part11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3]; //체크박스 배열
    private String[] names = {"사과", "배", "체리"}; //체크박스 문자열로 사용할 문자열 배열
    private JLabel sumLabel; //계산 합을 출력할 레이블

    public CheckBoxItemEventEx() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < fruits.length; i++) { //각 체크박스를 생성하고 컨텐트팬에 붙이고 ItemListener 등록하는 작업
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재 0원 입니다.");
        c.add(sumLabel);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx();
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;

        @Override
        public void itemStateChanged(ItemEvent e) { //체크박스의 선택상태가 변하면 호출됨.
            if (e.getStateChange() == ItemEvent.SELECTED) { //선택된 경우
                if (e.getItem() == fruits[0]) { //선택된 체크박스가 사과 체크박스인 경우
                    sum += 100;
                } else if (e.getItem() == fruits[1]) { //배 체크박스인 경우
                    sum += 500;
                } else { //체리 체크박스인 경우
                    sum += 20000;
                }
            } else { //선택 해제된 경우
                if (e.getItem() == fruits[0]) { //해제된 체크박스가 사과 체크박스인 경우
                    sum -= 100;
                } else if (e.getItem() == fruits[1]) { //배 체크박스인 경우
                    sum -= 500;
                } else { //체리 체크박스인 경우
                    sum -= 20000;
                }
            }
            sumLabel.setText("현재 " + sum + "원 입니다."); //합 출력
        }
    }
}
