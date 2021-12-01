import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class MouseMotion1 extends JFrame implements MouseMotionListener {
    JTextArea ta,tb;
    MouseMotion1()
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
        tb.addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e)
    {
        ta.setText("Mouse is Moved" + "\n" + ta.getText());
    }

    public void mouseDragged(MouseEvent e)
    {
        ta.setText("Mouse is Dragged" + "\n" + ta.getText());
    }

}

public class MouseMotion{
    public static void main (String []args)
    {
        MouseMotion1 e = new MouseMotion1();
        e.setBounds(100,100,1100,500);
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
