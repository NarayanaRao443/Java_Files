import java.awt.*;
import javax.swing.*;

class Boxdemo extends JFrame
{
    Boxdemo()
    {
        JLabel l1=new JLabel("Enter Name:");
        JTextField t1=new JTextField(20);
        t1.setMaximumSize(t1.getPreferredSize());

        Box hori1=Box.createHorizontalBox();
        hori1.add(l1);
        hori1.add(Box.createHorizontalStrut(20));
        hori1.add(t1);

        JLabel l2=new JLabel("Enter Password");
        JTextField t2=new JTextField(20);
        t2.setMaximumSize(t2.getPreferredSize());

        Box hori2=Box.createHorizontalBox();
        hori2.add(l2);
        hori2.add(Box.createHorizontalStrut(20));
        hori2.add(t2);

        JButton b1=new JButton("OK");
        JButton b2=new JButton("Cancel");

        Box hori3=Box.createHorizontalBox();
        hori3.add(b1);
        hori3.add(Box.createHorizontalGlue());
        hori3.add(b2);

        Box vert=Box.createVerticalBox();
        vert.add(hori1);
        vert.add(Box.createVerticalStrut(100));
        vert.add(hori2);
        vert.add(Box.createVerticalStrut(100));
        vert.add(hori3);
        

        Container c= getContentPane();
        c.add(vert);
    }

    public static void main(String args[])
    {
        Boxdemo bd=new Boxdemo();
        bd.setSize(500,500);
        bd.setTitle("Boxedemoo");
        bd.setVisible(true);
    }
}