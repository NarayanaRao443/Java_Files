import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Jlistdemo extends JFrame implements ListSelectionListener
{
    JList ls;
    JLabel lb;
    Object ar[];
    String msg="";

    Jlistdemo()
    {
        Container c=getContentPane();
        c.setLayout(null);
        String items[]={"India","America","Germany","Japan","France"};

        ls=new JList(items);
        ls.setBounds(100,50,100,100);
        c.add(ls);

        lb=new JLabel();
        lb.setBounds(100,200,200,40);
        c.add(lb);
        ls.addListSelectionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent le)
    {
        ar=ls.getSelectedValues();
        for(int i=0;i<ar.length;i++)
            msg+=(String)ar[i];
        
        lb.setText("Selected: "+msg);
        msg="";
    }
     public static void main(String args[])
    {
        Jlistdemo td=new Jlistdemo();
        td.setTitle("Tree Structure");
        td.setSize(500,500);
        td.setVisible(true);
    }
}