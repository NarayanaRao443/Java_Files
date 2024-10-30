import java.awt.*;
import java.awt.event.*;
class Dots extends Frame
{
    /*
    Dots()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    */
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        for(;;) //for continuous display
        {
            //generating the coordinates
            int x=(int) (Math.random() * 1000);
            int y=(int) (Math.random() * 800);

            //draw line to display a dot
            g.drawLine(x,y,x,y);
            try
            {
                Thread.sleep(10); //speed of the dots increased
            }
            catch(InterruptedException ie)
            {

            }

        }
    }

    public static void main(String args[])
    {
        Dots obj= new Dots();
        obj.setBackground(Color.blue);
        obj.setSize(500,400);
        obj.setTitle("Random Dots");
        obj.setVisible(true);
    }
}