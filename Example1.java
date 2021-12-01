import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.*;
public class Example1 {
    public static void main(String []args)
    {
        JFrame jf = new JFrame("Example1");
        jf.setBounds(100,100,500,700);
        Container c = jf.getContentPane();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        JTextArea ta = new JTextArea();
        ta.setBounds(100,100,200,100);
        c.add(ta);
        ta.setText("Type here");
        ta.setFont(new Font("Consolas", Font.BOLD, 15));
        ta.setLineWrap(true);
        ta.setEditable(false);
        JRadioButton r = new JRadioButton("Female");
        r.setBounds(100,200,20,20);
        c.add(r);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(100,250,20,20);
        c.add(r1);
        jf.setVisible(true);
    }
}
