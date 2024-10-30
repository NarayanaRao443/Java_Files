/*
import javax.swing.*;
import java.awt.*;
class Jlabels extends JFrame
{
    JLabel lb;
    
    Jlabels()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.red);

        lb=new JLabel("Hello Learners");
        lb.setFont(new Font("Helvetica", Font.BOLD,34));
        lb.setForeground(Color.green);
        c.add(lb);
    }
    public static void main(String args[])
    {
        Jlabels ob=new Jlabels();

        ob.setSize(500,500);
        ob.setTitle("my JFrames");
        ob.setVisible(true);
    }
}
*/

import java.awt.*;
import javax.swing.*;
class Jlabels extends JFrame
{
    JLabel lb;
    
    Jlabels()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);

        lb=new JLabel("Hello everyone");
        lb.setFont(new Font("Sanssarif", Font.BOLD,34));
        lb.setForeground(Color.red);
        c.add(lb);
    }

    public static void main(String args[])
    {
        Jlabels ob=new Jlabels();
        ob.setSize(500,500);
        ob.setTitle("Jlabels");
        ob.setVisible(true);
    }
}