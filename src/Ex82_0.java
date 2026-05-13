import javax.swing.*;
import java.awt.*;

public class Ex82_0 extends JFrame {
    public Ex82_0() {
        setTitle("Ex82_0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 레이어를 종료 시켰을때 프로그램이 종료 됨

        getContentPane().setBackground(Color.orange);
        getContentPane().setLayout(new FlowLayout());

        add(new JButton("ok"));
        add(new JButton("cancel"));
        add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }

    static void main(String[] args) {
        new Ex82_0();
    }
}
