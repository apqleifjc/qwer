import javax.swing.*;
import java.awt.*;

public class Ex84 extends JFrame {
    public Ex84() {
        setTitle("Ex84");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout(30,20));

        add(new JButton("add"), BorderLayout.NORTH);
        add(new JButton("sub"), BorderLayout.SOUTH);
        add(new JButton("mul"), BorderLayout.EAST);
        add(new JButton("div"), BorderLayout.WEST);
        add(new JButton("Calculate"), BorderLayout.CENTER);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex84();
    }
}
