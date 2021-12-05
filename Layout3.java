import javax.swing.*;
import java.awt.*;

class Layout3 extends JFrame
{
    JButton b1 = new JButton("Header");
    JButton b2 = new JButton("Footer");
    JButton b3 = new JButton("Left Column");
    JButton b4 = new JButton("Center Colum");
    JButton b5 = new JButton("Right Column");

    Layout3()
    {
        setBounds(100,100,700,500);
        setTitle("Border Layout");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        BorderLayout b = new BorderLayout();
        c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);
        
    }

public static void main (String []args)
{
    Layout3 l = new Layout3();
}

}