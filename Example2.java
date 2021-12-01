import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Example3 extends JFrame implements KeyListener {
    JTextArea ta,tb;
    Example3()
    {
        Container c = getContentPane();
        c.setLayout(null);
        tb = new JTextArea();
        tb.setBounds(600,100,400,300);
        tb.setFont(new Font("Consolas", Font.BOLD, 15));
        tb.setLineWrap(true);
        c.add(tb);
        ta = new JTextArea();
        ta.setBounds(100,100,400,300);
        c.add(ta);
        tb.addKeyListener(this);
    }

    public void keyReleased(KeyEvent e)
    {
        ta.setText("Key is Released" + "\n" + ta.getText());
    }

    public void keyTyped(KeyEvent e)
    {
        ta.setText("Key is Typed" + "\n" + ta.getText());
    }

    public void keyPressed(KeyEvent e)
    {
        ta.setText("Key is Pressed" + "\n" + ta.getText());
    }
}

public class Example2{
    public static void main (String []args)
    {
        Example3 e = new Example3();
        e.setBounds(100,100,1100,500);
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
