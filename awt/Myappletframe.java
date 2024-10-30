
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
class Myframe extends Frame
{
    public static void main(String args[])
    {
        Myframe f=new Myframe();
        f.setTitle("My AWT frames");
        f.setSize(500,500);
        f.setVisible(true);
        f.setBackground(Color.green);
        f.setLocation(300,300);
        f.addWindowListener(new WindowAdapter()
        {
            
            public void windowClosing(WindowEvent e)
             {
                  System.exit(0);
             }
        });

    }
}