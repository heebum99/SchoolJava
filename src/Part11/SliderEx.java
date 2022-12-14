package Part11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    public SliderEx() {
        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); //수평슬라이더, 최소 0 최대 200, 초기 선택값을 100으로 설정
        slider.setPaintLabels(true); //슬라이더의 레이블이 보이도록 설정
        slider.setPaintTicks(true); //슬라이더 눈금을 보이도록 설정
        slider.setPaintTrack(true); //슬라이더 트랙을 보이도록 설정
        slider.setMajorTickSpacing(50); //큰 눈금을 50으로 설정
        slider.setMinorTickSpacing(10); //작은 눈금을 10으로 설정
        c.add(slider);

        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SliderEx();
    }
}
