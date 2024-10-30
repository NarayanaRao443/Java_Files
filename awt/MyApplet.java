import java.awt.*;
import java.applet.Applet;
public class MyApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello World",100,100);
    }
}

/*
    

<applet code="MyApplet.class" width="300" height="300">
        
    </applet>
*/