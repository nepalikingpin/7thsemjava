import javax.swing.*;

// public class Example
// {
//     public static void main (String args[])
//     {
//         JFrame jf = new JFrame("Calculator");
//         //jf.setSize(100,150); //used only to set width and height
//         jf.setBounds(100,150,500,350); //used to set width, height and coordinates to be displayed on
//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         jf.setVisible(true);
//     }
// }

public class Example extends JFrame
{
    public Example(String s) {
        super(s);
    }

    public Example() {
    }
    public static void main (String args[])
    {
        Example ef = new Example("Calculator");
        //jf.setSize(100,150); //used only to set width and height
        ef.setBounds(100,150,500,500); //used to set width, height and coordinates to be displayed on
        ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ef.setVisible(true);
    }
}