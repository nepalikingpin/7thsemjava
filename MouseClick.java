import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class MouseClick1 extends JFrame implements MouseListener {
    JTextArea ta,tb;
    MouseClick1()
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
        tb.addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e)
    {
        ta.setText("Mouse is Entered" + "\n" + ta.getText());
    }

    public void mouseExited(MouseEvent e)
    {
        ta.setText("Mouse is Exited" + "\n" + ta.getText());
    }

    public void mouseClicked(MouseEvent e)
    {
        ta.setText("Mouse is Clicked" + "\n" + ta.getText());
    }

    public void mousePressed(MouseEvent e)
    {
        ta.setText("Mouse is Pressed" + "\n" + ta.getText());
    }

    public void mouseReleased(MouseEvent e)
    {
        ta.setText("Mouse is Released" + "\n" + ta.getText());
    }
}

public class MouseClick{
    public static void main (String []args)
    {
        MouseClick1 e = new MouseClick1();
        e.setBounds(100,100,1100,500);
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
