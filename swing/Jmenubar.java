import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Jmenubar extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu file,edit,view,go,selection;
    JMenuItem op,sa,cl,ed1,ed2,ed3,v1,v2,v3,edd1,edd2,edd3;

    Jmenubar()
    {
        
        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        mb=new JMenuBar();
        c.add("North",mb);

        //Menu
        file=new JMenu("File");
        edit=new JMenu("Edit");
        view=new JMenu("View");
        go=new JMenu("Go");
        selection=new JMenu("Selection");

        mb.add(file);
        mb.add(edit);
        mb.add(view);
        mb.add(go);
        mb.add(selection);

        op=new JMenuItem("Open");
        sa=new JMenuItem("Save");
        cl=new JMenuItem("Close");

        file.add(op);
        file.add(sa);
        file.add(cl);
        cl.setEnabled(false);

        ed1=new JMenuItem("Edit-1");
        ed2=new JMenu("Edit-2");
        ed3=new JMenuItem("Edit-3");

        edit.add(ed1);
        edit.add(ed2);
        edit.add(ed3); 

        edd1=new JMenuItem("Edit-11");
        edd2=new JMenuItem("Edit-12");
        edd3=new JMenuItem("Edit-13");

        ed2.add(edd1);
        ed2.add(edd2);
        ed2.add(edd3);

        v1=new JMenuItem("View-1");
        v2=new JMenuItem("View-2");
        v3=new JMenuItem("view-3");

        view.add(v1);
        view.add(v2);
        view.add(v3);

        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);

        ed1.addActionListener(this);
        ed2.addActionListener(this);
        ed3.addActionListener(this);

        edd1.addActionListener(this);
        edd2.addActionListener(this);
        edd3.addActionListener(this);

        v1.addActionListener(this);
        v2.addActionListener(this);
        v3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(op.isArmed())
            this.openFile();
        
    }

    void openFile()
    {
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION)
        {   File f=fc.getSelectedFile();
            String fname=f.getPath();

            OpenFrame of=new OpenFrame(fname);
            of.setSize(500,500);
            of.setVisible(true);
        } 
    }
    public static void main(String args[])
    {
        Jmenubar jm=new Jmenubar();
        jm.setSize(500,500);
        jm.setTitle("Menu Bar");
        jm.setVisible(true);
    }
}

class OpenFrame extends JFrame
{
    OpenFrame(String fname)
    {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        TextArea ta=new TextArea(22,60);
        c.add(ta);

        String str="";
        String str1="";

        try
        {
            BufferedReader br=new BufferedReader(new FileReader(fname));

            while(str=br.readLine()!=null)
                str1+=str+"\n";
            ta.setText(str1);
            br.close();

        }
        catch(Exception e)
        {

        }
    }
}