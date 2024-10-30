import java.awt.*;
import java.awt.event.*;
class Checkboxes extends Frame implements ItemListener
{
    String str="";
    Checkbox c1,c2,c3;

    Checkboxes()
    {

        setLayout(new FlowLayout());

        c1=new Checkbox("Bold",true);
        c2=new Checkbox("Italic");
        c3=new Checkbox("Underline");

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
        public void itemStateChanged(ItemEvent ie)
        {
            repaint();
        }

        public void paint(Graphics g)
        {
            g.drawString("Current state: ",10,100);
            str="Bold: "+c1.getState();

            g.drawString(str,10,120);
            str="Italic: " +c2.getState();

            g.drawString(str,10,140);
            str="Underline: " +c3.getState();
            g.drawString(str,10,160);
        }
    

    public static void main(String args[])
    {
        Checkboxes cb=new Checkboxes();
        
        cb.setTitle("Checkboxes");
        cb.setSize(500,500);
        cb.setVisible(true);
    }
}