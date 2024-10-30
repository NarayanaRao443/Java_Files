import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class AppletMouseListener extends Applet implements MouseListner
{
    String str = "";
    public void init()
    {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        str = "You clicked mouse";
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(str,75,150);
    }
}