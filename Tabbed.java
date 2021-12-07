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
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.add(new JLabel("First Page"));
        panel2.add(new JLabel("Second Page"));
        panel3.add(new JLabel("Third Page"));
        tabbedPane.add("First",panel1);
        tabbedPane.add("Second",panel2);
        tabbedPane.add("Third",panel3);
        jf.add(tabbedPane);
}

}