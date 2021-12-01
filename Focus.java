import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class Focus1 extends JFrame implements FocusListener {
    JTextArea ta;
    JTextField tb;
    Focus1()
    {
        Container c = getContentPane();
        c.setLayout(null);
        tb = new JTextField();
        tb.setBounds(600,100,400,300);
        c.add(tb);
        ta = new JTextArea();
        ta.setBounds(100,100,400,300);
        c.add(ta);
        tb.addFocusListener(this);
    }

    public void focusGained(FocusEvent e)
    {
        ta.setText("Focus is Gained" + "\n" + ta.getText());
    }

    public void focusLost(FocusEvent e)
    {
        ta.setText("Focus is Lost" + "\n" + ta.getText());
    }

}

public class Focus{
    public static void main (String []args)
    {
        Focus1 e = new Focus1();
        e.setBounds(100,100,1100,500);
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
