import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Buttondemo extends JFrame
{
    JButton b;
    Buttondemo()
    {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon i=new ImageIcon("camera.jpg");
       // i.setSize(100,100);
        b=new JButton("Click Me",i);
        b.setBackground(Color.red);
        b.setForeground(Color.yellow);
       // b.setFont(new Font("Arial",Font.BOLD,30));

        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        b.setToolTipText("This is a button");
        b.setMnemonic('C');
        c.add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        Buttondemo ob=new Buttondemo();
        ob.setTitle("Buttons");
        ob.setSize(500,500);
        ob.setVisible(true);
    }
}