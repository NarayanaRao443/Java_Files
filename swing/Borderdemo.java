import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Borderdemo extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    Borderdemo()
    {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        b1=new JButton("Raised bevel border");
        b2=new JButton("Lowered bevel border");
        b3=new JButton("Raised Etched border");
        b4=new JButton("Lowered Etched border");
        b5=new JButton("Line border");
        b6=new JButton("Matte border");
        b7=new JButton("Compound border");
        b8=new JButton("Empty border");

        Border bd=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green);
        b1.setBorder(bd);

        bd=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        b2.setBorder(bd);

        bd=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red,Color.green);
        b3.setBorder(bd);

        bd=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        b4.setBorder(bd);

        bd=BorderFactory.createLineBorder(Color.red,5);
        b5.setBorder(bd);

        bd=BorderFactory.createMatteBorder(5,10,15,20,Color.red);
        b6.setBorder(bd);

        bd=BorderFactory.createCompoundBorder();
        b7.setBorder(bd);

        bd=BorderFactory.createEmptyBorder();
        b8.setBorder(bd);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String args[])
    {
        Borderdemo ob=new Borderdemo();
        ob.setTitle("Borders");
        ob.setVisible(true);
        ob.setSize(500,500);
    }
}