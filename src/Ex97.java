import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex97 extends JFrame {
    private JPanel contentPane = new JPanel();
    private JLabel la = new JLabel("hello");

    public Ex97() {
        super("Ex97");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());

        la.setLocation(100, 100);
        la.setSize(300, 100);
        c.add(la);

        setSize(300, 300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP: // 방향키를 눌렀을때 발생함
                    la.setLocation(la.getX(), la.getY() - 10);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() + 10);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - 10, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + 10, la.getY());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Ex97 ex97 = new Ex97();
    }
}
