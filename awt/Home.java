import java.awt.*;
import java.awt.event.*;
class Home extends Frame
{
    Home()
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
        int x[]={375,275,475};
        int y[]={125,200,200};
        int n=3;

        this.setBackground(Color.pink);
        g.setColor(Color.black);
        g.drawLine(50,80,700,80);
        g.drawLine(50,80,50,400);
        g.drawLine(700,80,700,400);

        //For Walls
        g.setColor(Color.yellow);
        g.fillRect(300,200,150,130);

        //For Door
        g.setColor(Color.blue);
        g.fillRect(340,210,80,80);

        //For Bottom  Line
        g.setColor(Color.red);
        g.drawLine(350,300,410,300);

        //For Windows
        g.setColor(Color.red);
        g.fillRect(360,220,20,45);
        g.setColor(Color.green);
        g.fillRect(390,220,20,45);

        //For Roof
        g.setColor(Color.darkGray);
        g.fillPolygon(x,y,n);
        
        //For Moon

        g.setColor(Color.cyan);
        g.fillOval(100,100,60,60);

        //For grass for arcs-grass

        g.setColor(Color.green);
        g.fillArc(50,250,150,100,0,180);
        g.fillArc(150,250,150,100,0,180);
        g.fillArc(460,250,150,100,0,180);

        //For Bottom most line
        g.setColor(Color.black);
        g.drawLine(50,400,700,400);
        
    }


public static void main(String args[])
{
    Home h=new Home();
    h.setSize(800,800);
    h.setTitle("My Home");
    h.setVisible(true);
}
}