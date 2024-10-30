import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Flow extends JFrame //implements ActionListener
{
    Container c;
     JButton b1,b2,b3,b4;
     Flow()
    {
        c=getContentPane();
        FlowLayout ob=new FlowLayout(FlowLayout.CENTER,10,10);
        c.setLayout(ob);
           
        b1= new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);

      /*  b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
      */

    }/*
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
        
    }
    */
    public static void main(String args[])
    {
        Flow f=new Flow();
        f.setSize(400,400);
        f.setVisible(true);
        f.setTitle("Flow Layout");
    }
}