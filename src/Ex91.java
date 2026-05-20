import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex91 extends JFrame {
    public Ex91() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Action");
        b1.addActionListener(new MyActionListener()); // Action 이벤트 리스너에 등록한다
        c.add(b1);
        setSize(250,120);
        setVisible(true);
    }

    static void main(String[] args) {
        new Ex91();
    }
}
// 독립된 클래스로 이벤트 리스너를 작성한다
class MyActionListener implements ActionListener { // Action 이벤트 리스너를 구현한다
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else
            b.setText("Action");
    }
}
