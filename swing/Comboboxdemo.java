import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Comboboxdemo extends JFrame implements ItemListener
{
    JComboBox box;
    JLabel lb;

    Comboboxdemo()
    {
        Container c=getContentPane();
        c.setLayout(null);

        box=new JComboBox();

        box.addItem("India");
        box.addItem("America");        
        box.addItem("Germany");
        box.addItem("England"); 
        box.addItem("Japan");
        box.addItem("France");

        box.setBounds(100,50,100,40);
        c.add(box);

        lb=new JLabel();
        lb.setBounds(100,200,200,40);
        c.add(lb);
        box.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String str=(String)box.getSelectedItem();
        lb.setText("You Selected: "+str);
    }
     public static void main(String args[])
    {
        Comboboxdemo td=new Comboboxdemo();
        td.setTitle("Tree Structure");
        td.setSize(500,500);
        td.setVisible(true);
    }
}