import java.awt.*;
import java.awt.event.*;
class Scrollbars extends Frame implements AdjustmentListener
{
   String msg="";
    Scrollbar s1;

    Scrollbars()
    {
        setLayout(null);

        //For empty choice menu
        s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);

        //add some items to choice menu
       s1.setBounds(250,50,30,200);
       add(s1);
       s1.addAdjustmentListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void addAdjustmentValueChanged(AdjustmentEvent ae)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString("SCROLLBAR POSITIONS: ", 20,150);
        msg=msg+s1.getValue();
        g.drawString(msg,20,180);
        msg="";

        
    }

    public static void main(String args[])
    {
        Scrollbars sc=new Scrollbars();
        sc.setSize(500,500);
        sc.setTitle("Choice Box");
        sc.setVisible(true);
    }
}