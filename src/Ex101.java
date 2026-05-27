import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex101 extends JFrame {
    public Ex101() {
        super("Ex101");
        setLayout(new FlowLayout());
        JButton b1 = new JButton("Magenta/Yellow Button"); // 배경색을 스위치하는 버튼
        JButton b2 = new JButton("Disabled Button"); // 비활성 버튼
        JButton b3 = new JButton("getX(), getY()"); // 타이틀바에 버튼의 좌표를 출력함
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.MAGENTA);
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // 폰트를 이텔릭체로 바꿈
        b2.setEnabled(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                setTitle(b.getX() + "," + b.getY());
            }
        });
        add(b1); // 실무에선 사용금지
        add(b2); // 직관적으로 보면 알수있도록 변수명 지정하기
        add(b3);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex101();
    }
}
