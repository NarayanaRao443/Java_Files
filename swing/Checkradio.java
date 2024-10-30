import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Checkradio extends JFrame implements ActionListener

{
    JCheckBox cb1,cb2;
    JRadioButton r1,r2;
    JTextArea ta;
    ButtonGroup bg;
    String msg="";

    Checkradio()
    {
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        
        ta=new JTextArea(5,100);

        cb1=new JCheckBox("Java",true);
        cb2=new JCheckBox("J2EE");

        r1=new JRadioButton("Male",true);
        r2=new JRadioButton("Female");

        bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c.add(cb1);
        c.add(cb2);
        c.add(r1);
        c.add(r2);
        c.add(ta);

        cb1.addActionListener(this);
        cb2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        public void actionPerformed(ActionEvent ae)
        {
            if(cb1.getModel().isSelected())
                msg+="\n JAVA";
            if(cb2.getModel().isSelected())
                msg+="\n J2EE";
            if(r1.getModel().isSelected())
                msg+="\n Male";
            else
                msg+="\n Female";
            ta.setText(msg);

            msg="";
        }

    public static void main(String args[])
    {
        Checkradio ob=new Checkradio();
        ob.setTitle("Check Radio");
        ob.setSize(500,500);
        ob.setVisible(true);
    }
}