import javax.swing.*;
import java.awt.*;

class Layout1 extends JFrame {
    
public static void main (String []args)
{
    JFrame jf = new JFrame("Null Layout Example");
    jf.setBounds(100,100,500,700);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = jf.getContentPane();
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");
    b1.setBounds(20,20,100,20);
    b2.setBounds(120,20,100,20);
    b3.setBounds(220,20,100,20);
    b4.setBounds(20,40,100,20);
    b5.setBounds(120,40,100,20);
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.add(b5);
    c.setLayout(null);
}
}