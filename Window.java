import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class Window1 extends JFrame implements WindowListener {
    JTextArea ta;
    Window1()
    {
        Container c = getContentPane();
        c.setLayout(null);
        addWindowListener(this);
    }

    public void windowActivated(WindowEvent e)
    {
        System.out.println("Window Activated");
    }

    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window Closed");
    }
    
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window Closing");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Window Deactivated");
    }

    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window Deiconified");
    }

    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened");
    }

}

public class Window{
    public static void main (String []args)
    {
        Window1 e = new Window1();
        e.setBounds(100,100,1100,500);
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
