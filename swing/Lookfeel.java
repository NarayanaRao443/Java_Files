import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.*;

class Lookfeel extends JFrame implements ActionListener
{
    JButton b;
    JCheckBox cb;
    JTextField t;
    JRadioButton r1,r2,r3;
    ButtonGroup bg;
    Container c;

    Lookfeel()
    {
        c=this.getContentPane();
        c.setLayout(null);

        b=new JButton("Button");
        cb=new JCheckBox("CheckBox");
        t=new JTextField("TextField",15);
        r1=new JRadioButton("Metal");
        r2=new JRadioButton("Motif");
        r3=new JRadioButton("Windows");
        
        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        b.setBounds(100,100,75,40);
        cb.setBounds(200,100,100,40);
        t.setBounds(100,150,100,40);
        r1.setBounds(50,250,100,30);
        r2.setBounds(150,250,100,30);
        r3.setBounds(250,250,100,30);

        c.add(b);
        c.add(cb);
        c.add(t);
        c.add(r1);
        c.add(r2);
        c.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            if(r1.getModel().isSelected())
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            
            if(r2.getModel().isSelected())
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

            if(r3.getModel().isSelected())
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            SwingUtilities.updateComponentTreeUI(c);

        }
        catch(Exception e)
        {

        }
    }

    public static void main(String args[])
    {
        Lookfeel lf=new Lookfeel();
        lf.setSize(500,500);
        lf.setTitle("Look Feel");
        lf.setVisible(true);
    }
}