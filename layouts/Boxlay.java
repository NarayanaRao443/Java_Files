import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Boxlay extends JFrame
{
    Boxlay()
    {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        MyPanel1 pl=new MyPanel1();
        c.add(pl);

        MyPanel2 pl2=new MyPanel2();
        c.add(pl2);
    }

    public static void main(String args[])
    {
        Boxlay bl=new Boxlay();
        bl.setSize(400,500);
        bl.setVisible(true);
        bl.setTitle("Box Layout");
    
    }
}

class MyPanel1 extends JPanel
{
    MyPanel1()
    {
        BoxLayout box1=new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(box1);

        JButton b1,b2,b3;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");

        add(b1);
        add(b2);
        add(b3);

    }
}

class MyPanel2 extends JPanel
{
    MyPanel2()
    {
        BoxLayout box2=new BoxLayout(this,BoxLayout.Y_AXIS);
        setLayout(box2);

        JButton b1,b2,b3;
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");

        add(b1);
        add(b2);
        add(b3);


    }
}