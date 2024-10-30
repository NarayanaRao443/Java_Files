import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class Treedemo extends JFrame implements TreeSelectionListener
{
    DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
    JTree tree;
    Container c;
    String msg="";
    JTextArea ta;

    Treedemo()
    {
        c=getContentPane();
        c.setLayout(new BorderLayout());

        root=new DefaultMutableTreeNode("C:\\");

        dir1=new DefaultMutableTreeNode("Java Programs");
        dir2=new DefaultMutableTreeNode("Others");
        file1=new DefaultMutableTreeNode("JButtonDemo.java");
        file2=new DefaultMutableTreeNode("JCheckBoxDemo.java");
        file3=new DefaultMutableTreeNode("xyz.c");

        root.add(dir1);
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        dir2.add(file3);

        tree=new JTree(root);
        ta=new JTextArea();
        c.add("South",ta);
        tree.addTreeSelectionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ValueChanged(TreeSelectionEvent tse)
    {
        TreePath tp=tse.getNewLeadSelectionPath();
        msg+="\n Path of selected component= "+tp;
        
        Object comp=tp.getLastPathComponent();
        msg+="\n Component Selected=" +comp;

        int n=tp.getPathCount();
        msg+="\n Level of Component= "+n;

        ta.setText(msg);
        msg="";
    }

    public static void main(String args[])
    {
        Treedemo td=new Treedemo();
        td.setTitle("Tree Structure");
        td.setSize(500,500);
        td.setVisible(true);
    }
}