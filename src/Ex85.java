import javax.swing.*;
import java.awt.*;

public class Ex85 extends JFrame {
    public Ex85() {
        super("Ex85");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new GridLayout(5,2));

        for (int i=0; i<10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            add(button);
        }
        setVisible(true);
        setSize(500,200);
    }
    public static void main(String[] args) {
        new Ex85();
    }
}
