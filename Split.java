import javax.swing.*;


public class Split extends JFrame {
    Split() 
    {
        setSize(500,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JButton b1 = new JButton("Left");
        JButton b2 = new JButton("Right");
        sp.setTopComponent(b1);
        sp.setBottomComponent(b2);
        sp.setDividerSize(10);
        sp.setDividerLocation(240);
        sp.setOneTouchExpandable(true);
        add(sp);
    }

public static void main(String[] args) {
    Split s = new Split();
}

}