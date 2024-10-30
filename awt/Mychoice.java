import java.awt.*;
import java.awt.event.*;
class Mychoice extends Frame implements ItemListener
{
    String str;
    Choice ch;

    Mychoice()
    {
        setLayout(new FlowLayout());

        //For empty choice menu
        ch=new Choice();

        //add some items to choice menu
        ch.add("Telugu");
        ch.add("Hindi");
        ch.add("English");
        ch.add("Maths");
        ch.add("Science");
        ch.add("Social");

        //add the choice menu to frame
        add(ch);
        ch.addItemListener(this);

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
        g.drawString("Selected Languages: ", 10,100);
        str=ch.getSelectedItem();
        g.drawString(str,10,120);
    }

    public static void main(String args[])
    {
        Mychoice mc=new Mychoice();
        mc.setSize(500,500);
        mc.setTitle("Choice Box");
        mc.setVisible(true);
    }
}