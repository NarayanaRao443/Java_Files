import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
   int msg[];
    List ls;

    Mylist()
    {
        setLayout(new FlowLayout());

        //For empty choice menu
        ls=new List(3,true);

        //add some items to choice menu
        ls.add("Telugu");
        ls.add("Hindi"); 
        ls.add("English");
        ls.add("Maths");
        ls.add("Science");
        ls.add("Social");

        //add the list menu to frame
        add(ls);
        ls.addItemListener(this);

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
        msg=ls.getSelectedIndexes();

        for(int i=0;i<msg.length;i++)
        {
            String item=ls.getItem(msg[i]);
            g.drawString(item,10,220+i*20);
        }
    }

    public static void main(String args[])
    {
        Mylist mc=new Mylist();
        mc.setSize(500,500);
        mc.setTitle("Choice Box");
        mc.setVisible(true);
    }
}