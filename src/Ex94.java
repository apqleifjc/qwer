import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex94 extends JFrame {
    private JLabel la = new JLabel("hello");

    public Ex94() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new Ex94MyMouseAdapter());

        c.setLayout(null);
        la.setSize(50,20);
        la.setLocation(30,30);
        c.add(la);

        setSize(200,200);
        setVisible(true);
    }

    class Ex94MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new Ex94();
    }
}
