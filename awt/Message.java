import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
    Message()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        this.setBackground(new Color(100,20,20));

        Font f=new Font("SansSerif", Font.BOLD,30); //for Font style and size
        g.setFont(f);
        g.setColor(Color.green); //for Font color
        g.drawString("Hello, How are you?", 100,100);
    }

    public static void main(String args[])
    {
        Message ob=new Message();
        ob.setSize(500,500);
        ob.setTitle("This is about Fonts");
        ob.setVisible(true);
    }
}