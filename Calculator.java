import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame
{
    public Calculator(String s) {
        super(s);
    }

    public Calculator() {
    }

    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    public void SetComponent()
    {
        l1 = new JLabel("Simple Calculator");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        l4 = new JLabel();
        setLayout(null);
        l1.setBounds(220,30,150,30);
        l2.setBounds(130,60,100,30);
        l3.setBounds(130,90,100,30);
        t1.setBounds(230,60,100,30);
        t2.setBounds(230,90,100,30);
        b1.setBounds(220,130,50,30);
        b2.setBounds(270,130,50,30);
        b3.setBounds(220,160,50,30);
        b4.setBounds(270,160,50,30);
        l4.setBounds(230,200,150,30);
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l4);
    }
    class Handler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
           int a = Integer.parseInt(t1.getText());
           int b = Integer.parseInt(t2.getText());
           float c = 0;
           if (e.getSource().equals(b1)) {
            c = a + b;
        } else if (e.getSource().equals(b2)) {
            c = a - b;
        } else if (e.getSource().equals(b3)) {
            c = a * b;
        } else if (e.getSource().equals(b4)) {
            c =  (float)a / b;
        }
        l4.setText("Answer is:" +c);
        }
    }
    public static void main (String args[])
    {
        Calculator cl = new Calculator("Simple Calculator");
        cl.setBounds(100,150,500,700);
        cl.SetComponent();
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}