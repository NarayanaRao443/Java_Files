import javax.swing.*;
import java.awt.*;

class Mypanel extends JPanel
{
    Mypanel()
    {
        this.setBackground(Color.red);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.setFont(new Font("Helvetica",Font.BOLD,34));
        g.drawString("Hello Learners",50,100);
    }
}

class Jframes1 extends JFrame
{
    Jframes1()
    {
        Container c=this.getContentPane();
        Mypanel mp=new Mypanel();
        c.add(mp);
    }

    public static void main(String args[])
    {
        Jframes1 ob=new Jframes1();
        ob.setTitle("My Swing Frame");
        ob.setSize(500,500);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}