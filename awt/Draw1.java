/*
import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
    Draw1()
    {
        this.addWindowListener(new WindowAdapter()
        {
             public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
           }   );
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
       // g.setBackground(Color.blue);
        g.drawRect(40,70,200,200);
       // g.drawLine(90,70,100,200);
      //  g.drawfullRect(30,30,200,100);
        g.drawOval(90,70,80,80);
        g.drawOval(110,95,5,5);
        g.drawOval(145,95,5,5);
        g.drawLine(130,95,130,115);
        g.drawArc(113,115,35,20,0,-180);

    }

    public static void main(String args[])
    {
        Draw1 d=new Draw1();
        d.setSize(500,500);
        d.setTitle("Rectangles");
        d.setVisible(true);
        d.setBackground(Color.yellow);
    }
}
*/

import java.awt.*;
import java.awt.event.*;
class Draw1 extends Frame
{
    Draw1()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
       // g.drawOval(110,100,100,200);
        //g.drawLine(30,40,90,200);
        //g.drawRect(100,100,200,200);
        g.fillRect(60,40,200,200);
        g.setColor(Color.yellow);
        g.fillOval(90,70,80,80);
        g.setColor(Color.black);
        g.fillOval(110,95,5,5);
        g.fillOval(145,95,5,5);
        g.drawLine(130,95,130,115);
        g.setColor(Color.blue);
        g.fillArc(113,115,35,20,0,-180);
        g.fillRoundRect(300,300,140,130,30,30);

        int x[]={340,200,40,100,120};
        int y[]={140,40,200,100,120};
        int n=5;
        g.fillPolygon(x,y,n);

        g.setColor(Color.green);
        g.fill3DRect(600,40,300,200,true);
        

        //g.setColor(Color.black);
        //g.clipRect(600,60,500,300);
       
    }

    public static void main(String args[])
    {
        Draw1 d=new Draw1();
        d.setTitle("My first Drawing");
        d.setSize(1000,500);
      //  d.setBackground(Color.yellow);
        d.setVisible(true);
    }
}