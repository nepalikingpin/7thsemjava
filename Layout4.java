import javax.swing.*;
import java.awt.*;

class Layout4 extends JFrame
{
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");

    Layout4()
    {
        setBounds(100,100,700,500);
        setTitle("Grid Layout");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        GridLayout g = new GridLayout(2,3);
        g.setHgap(20);
        g.setVgap(20);
        c.setLayout(g);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        
    }

public static void main (String []args)
{
    Layout4 l = new Layout4();
}

}