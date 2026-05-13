import javax.swing.*;
import java.awt.*;

public class Ex83 extends JFrame {
    public Ex83() {
        setTitle("Ex83");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃의 버튼 위치를 왼쪽으로 정렬 수평30, 수직40 간격으로 벌려라
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,30,40));

        add(new JButton("add"));
        add(new JButton("sub"));
        add(new JButton("mul"));
        add(new JButton("div"));
        add(new JButton("Calculate"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex83();
    }
}
