/*
import java.awt.*;
class Myframe
{

    public static void main(String args[])
    {
        Frame f=new Frame("My AWT frame");
        f.setSize(400,400);
        f.setVisible(true);
    }
}

*/

/*
import java.awt.*;
class Myframe extends Frame
{
    Myframe(String str)
    {
        super(str);
    }

    public static void main(String args[])
    {
        Myframe f=new Myframe("My AWT frame");
        f.setSize(400,400);
        f.setVisible(true);
    }
}
*/
/*

import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame
{
    public static void main(String args[])
    {
        Myframe f=new Myframe();
        f.setTitle("My AWT frame");
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new Myclass());
    }
}

class Myclass implements WindowListener
{
    public void windowActivated(WindowEvent e){}
   public void widowClosed(WindowEvent e){}
    public void windowclosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    
    public void windowDeiconified(WindowEvent e){}
    
    public void windowIconified(WindowEvent e){}
    
    public void windowOpened(WindowEvent e){}
}

*/
/*

import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame
{
    public static void main(String args[])
    {
        Myframe f=new Myframe();
        f.setTitle("My AWT frames");
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new Myclass());

    }
}

class Myclass extends WindowAdapter
{
    public void windowclosing(WindowEvent e)
    {
        System.exit(0);
    }
}

*/



/*
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

public class Myframe extends Frame
{
    Myframe()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowclosing(WindowEvent e)
            {
                dispose();
            }
        });
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new Myframe();
    }
}
*/
