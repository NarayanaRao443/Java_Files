import java.awt.*;
import java.awt.event.*;
class Radiobuttons extends Frame implements ItemListener
{
    String str="";
    CheckboxGroup cbg;
    Checkbox r1,r2;

    Radiobuttons()
    {

        setLayout(new FlowLayout());
        cbg=new CheckboxGroup();

        r1=new Checkbox("Yes",cbg,true);
        r2=new Checkbox("No",cbg,false);
      
        add(r1);
        add(r2);
        

        r1.addItemListener(this);
        r2.addItemListener(this);
        
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
        
            str="Current Selection: ";
            str=str+cbg.getSelectedCheckbox().getLabel();

            g.drawString(str,10,120);
            
        }
    

    public static void main(String args[])
    {
        Radiobuttons cb=new Radiobuttons();
        
        cb.setTitle("Radio Button");
        cb.setSize(500,500);
        cb.setVisible(true);
    }
}