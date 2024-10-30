import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Border extends JFrame //implements ActionListener
{
    Container c;
    BorderLayout ob;
    JButton b1,b2,b3,b4,b5;

    Border()
    {
        c=getContentPane();
        ob=new BorderLayout(10,10);
        c.setLayout(ob);

        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");


        c.add("North",b1);
        c.add("East",b2);
        c.add("South",b3);
        c.add("West",b4);
        c.add("Center",b5);
/*
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
*/
}
    /*
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            c.setBackground(Color.yellow);
            b1.setBackground(Color.red);
        }
         if(ae.getSource()==b2)
        {
            c.setBackground(Color.red);
            b2.setBackground(Color.blue);
        }
         if(ae.getSource()==b3)
        {
            c.setBackground(Color.blue);
            b3.setBackground(Color.pink);
        }
         if(ae.getSource()==b4)
        {
            c.setBackground(Color.pink);
            b4.setBackground(Color.yellow);
        }
        if(ae.getSource()==b5)
        {
            c.setBackground(Color.green);
            b5.setBackground(Color.gray);
        }
    }
    */
    public static void  main(String args[])
    {
        Border b=new Border();
        b.setTitle("Border Layout");
        b.setVisible(true);
        b.setSize(500,500);
    }
}