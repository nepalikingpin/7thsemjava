import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Popup extends JFrame {
    JPopupMenu pm;
    JMenuItem m1,m2,m3;

    Popup()
    {
        setSize(500,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        pm = new JPopupMenu();
        m1 = new JMenuItem("Item 1");
        m2 = new JMenuItem("Item 2");
        m3 = new JMenuItem("Item 3");
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(e.getButton() == MouseEvent.BUTTON1)
                {
                    int x = e.getX();
                    int y = e.getY();
                    pm.show(Popup.this,x,y);
                }
            }
        }
        );
    }

    public static void main(String[] args) {
        Popup p = new Popup();
}

}
