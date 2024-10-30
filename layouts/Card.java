import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Card extends JFrame implements ActionListener
{
    Container c;
    CardLayout ca;
    JButton b1,b2,b3,b4,b5;

   Card()
    {
        c=getContentPane();
        ca=new CardLayout(50,10);
        c.setLayout(ca);

        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");


        c.add("First Card",b1);
        c.add("Second Card",b2);
        c.add("Third Card",b3);
        c.add("Fourth Card",b4);
        c.add("Fifth Card",b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

}
    
    public void actionPerformed(ActionEvent ae)
    {
        ca.next(c);
        
    }
    
    public static void  main(String args[])
    {
       Card b=new Card();
        b.setTitle("Border Layout");
        b.setVisible(true);
        b.setSize(500,500);
    }
}