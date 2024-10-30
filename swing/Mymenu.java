import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class Mymenu extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu file,edit,view,font;
    JMenuItem op,sa,cl,cp,pt,f1,f2,v1,v2,v3,f11,f22,f33,v11,v22,v33;

    Mymenu()
    {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        mb=new JMenuBar();
        c.add("North",mb);

        file=new JMenu("File");
        edit=new JMenu("Edit");
        view=new JMenu("View");

        mb.add(file);
        mb.add(edit);
        mb.add(view);

        op=new JMenuItem("Open");
        sa=new JMenuItem("Save");
        cl=new JMenuItem("Close");
        cp=new JMenuItem("Copy");
        pt=new JMenuItem("Paste");

        v1=new JMenuItem("V1");
        v2=new JMenu("V2");
        v3=new JMenuItem("V3");

        file.add(op);
        file.add(sa);
        file.add(cl);

        edit.add(cp);
        edit.add(pt);

        view.add(v1);
        view.add(v2);
        view.add(v3);

        v11=new JMenuItem("v11");
        v22=new JMenuItem("v22");
        v33=new JMenuItem("v33");

        v2.add(v11);
        v2.add(v22);
        v2.add(v33);


      //  cl.setEnabled(false);

        file.addSeparator();
        font=new JMenu("Font");
        file.add(font);

        f1=new JMenu("Arial");
        f2=new JMenuItem("Times New Roman");
        font.add(f1);
        font.add(f2);

        //f1.addSeparator();
        f11=new JMenuItem("f11");
        f22=new JMenuItem("f22");
        f33=new JMenuItem("f33");
        f1.add(f11);
        f1.add(f22);
        f1.add(f33);

        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        
        f1.addActionListener(this);
        f2.addActionListener(this);

        f11.addActionListener(this);
        f22.addActionListener(this);
        f33.addActionListener(this);

        v11.addActionListener(this);
        v22.addActionListener(this);
        v33.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
            if(op.isArmed())
                System.out.println("Open is selected");
            if(sa.isArmed())
                System.out.println("Save is selected");
            if(cl.isArmed())
                System.out.println("Close is selected");
            if(cp.isArmed())
                System.out.println("Copy is selected");
            if(pt.isArmed())
                System.out.println("Paste is selected");

            if(f1.isArmed())
                System.out.println("Arail font is selected");
            if(f2.isArmed())
                System.out.println("Times New Roman is selected");
            if(f11.isArmed())
                System.out.println("F11 is selected");
            if(f22.isArmed())
                System.out.println("F22 is selected");
            if(f33.isArmed())
                System.out.println("F33 is selected");
    }
    public static void main(String args[])
    {
        Mymenu me=new Mymenu();
        me.setSize(500,500);
        me.setTitle("Menu Bar");
        me.setVisible(true);
    }
}