import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class Ex81 extends JFrame {
    public Ex81(){
        //setTitle("300x300 스윙 프레임 만들기");
        super("Ex81");
        setSize(300,300);
        setVisible(true);
        Container ContentPane = getContentPane();
        JButton b1 = new JButton("B1");
        ContentPane.add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ex81 frame = new Ex81();
    }
}
