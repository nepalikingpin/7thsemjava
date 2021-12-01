import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Registration extends JFrame implements ActionListener
{

JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4;
JCheckBox c1;
JButton b1;
JTextArea ta;
JComboBox day,month,year;
JRadioButton r1,r2;
    public Registration() {
        setTitle("Registration Form");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(null);
        l1 = new JLabel("Name");
        l1.setBounds(30, 30, 100, 30);
        c.add(l1);
        t1 = new JTextField();
        t1.setBounds(100,30,100,30);
        c.add(t1);
        l2 = new JLabel("Address");
        l2.setBounds(30,70,100,30);
        c.add(l2);
        t2 = new JTextField();
        t2.setBounds(100,70,100,30);
        c.add(t2);
        l3 = new JLabel("Email");
        l3.setBounds(30,110,100,30);
        c.add(l3);
        t3 = new JTextField();
        t3.setBounds(100,110,100,30);
        c.add(t3);
        l4 = new JLabel("Phone");
        l4.setBounds(30,150,100,30);
        c.add(l4);
        t4 = new JTextField();
        t4.setBounds(100,150,100,30);
        c.add(t4);
        l5 = new JLabel("Gender");
        l5.setBounds(30,190,100,30);
        c.add(l5);
        r1 = new JRadioButton("Male");
        r1.setBounds(100,190,100,30);
        r2 = new JRadioButton("Female");
        r2.setBounds(200,190,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c.add(r1);
        c.add(r2);
        l6 = new JLabel("DOB");
        l6.setBounds(30,230,100,30);
        c.add(l6);
        String days[] = {"1", "2", "3", "4"};
        String months[] = {"1", "2", "3"};
        String years[] = {"2021", "2020", "2019", "2018"};
        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);
        day.setBounds(100,230,20,20);
        month.setBounds(120,230,20,20);
        year.setBounds(140,230,20,20);
        c.add(day);
        c.add(month);
        c.add(year);
        c1 = new JCheckBox("I agree to the terms and conditions");
        c1.setBounds(30,270,500,30);
        c.add(c1);
        b1 = new JButton("Submit");
        b1.setBounds(60,300,100,30);
        c.add(b1);
        l7 = new JLabel();
        l7.setBounds(30,330,200,30);
        c.add(l7);
        ta = new JTextArea("");
        ta.setBounds(300,90,200,200);
        c.add(ta);
        b1.addActionListener(this);
        setVisible(true);
    }

public void actionPerformed(ActionEvent e)
{
    if(c1.isSelected())
    {
        l7.setText("Registration Successful");
        String name = t1.getText();
        String add = t2.getText();
        String email = t3.getText();
        int phone = Integer.parseInt(t4.getText());
        String gender ="Male";
        if(r2.isSelected())
            gender = "Female";
        String dob = day.getSelectedItem() + "" + month.getSelectedItem() + "" + year.getSelectedItem();
        ta.setText("Name="+name + "\n" + "Add=" +add +"\n" + "Email=" +email +"\n" + "Phone="+phone);
    }
}
public static void main (String []args) {
    Registration rf = new Registration();
}
}
