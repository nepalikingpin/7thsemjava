import javax.swing.*;
import java.awt.*;

class Layout2 extends JFrame
{
    JButton b1 = new JButton("Button 1 Enter your name");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");

    Layout2()
    {
        setBounds(100,100,700,500);
        setTitle("Layout2");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,20,20);
        c.setLayout(fl);
        c.add(b1);
        c.add(b2);
        c.add(b3,0);
        c.add(b4);
        c.add(b5);
        
    }

public static void main (String []args)
{
    Layout2 l = new Layout2();
}

}