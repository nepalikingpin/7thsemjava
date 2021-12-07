import javax.swing.*;


public class Tabbed extends JFrame{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Tabbed Pane");
        jf.setBounds(100,100,500,700);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,300,200);
        jf.add(tabbedPane);
}

}