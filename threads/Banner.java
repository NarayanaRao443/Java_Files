import java.awt.*;
class Banner extends Frame implements Runnable
{
    String str="Dream Tech Publications ";

    Banner()
    {
        setLayout(null);
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void paint(Graphics g)
    {
        Font f=new Font("Courier",Font.BOLD,40);
        g.setFont(f);
        g.drawString(str,10,100);
    }

    public void run()
    {
        for(;;)
        {
            repaint();

            try
            {
                Thread.sleep(400);
            }
            catch(InterruptedException ie)
            {

            }
            
                char ch=str.charAt(0);
                str=str.substring(1,str.length());
                str=str+ch;
            
        }
    }

    public static void main(String args[])
    {
        Banner b=new Banner();
        b.setVisible(true);
        b.setSize(500,500);
        b.setTitle("My Banner");

        Thread t=new Thread(b);
        t.start();
    }
}