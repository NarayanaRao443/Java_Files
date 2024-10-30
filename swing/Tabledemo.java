import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;

class Tabledemo extends JFrame 
{
    Tabledemo()
    {
        //To represent the data of table
        Vector<Vector> data=new Vector<Vector>();

        //To represent the row
        Vector<String> row=new Vector<String>();

    //First Row
        row.add("Ramarao");
        row.add("Analyst");
        row.add("22,000.00");

        data.add(row);
    
    //Second Row

    row=new Vector<String>();
    row.add("Srinivas Kumar");
    row.add("Programmer");
    row.add("18,000");

    data.add(row);

    //Thrid row

    row=new Vector<String>();
    row.add("Vinaya Devi");
    row.add("Programmer");
    row.add("16,000");

    data.add(row);

    //to represents the columns

    Vector<String> cols=new Vector<String>();
    cols.add("Employee Name");
    cols.add("Designation");
    cols.add("Salary");

    JTable tab=new JTable(data,cols);

    tab.setBorder(BorderFactory.createLineBorder(Color.green,2));
    tab.setFont(new Font("Arial", Font.BOLD,20));
    tab.setRowHeight(30);
    tab.setGridColor(Color.red);

    JTableHeader head=tab.getTableHeader();
    Container c=getContentPane();
    c.setLayout(new BorderLayout());
    c.add("North",head);
    c.add("Center",tab);

    }
    public static void main(String args[])
    {
        Tabledemo demo=new Tabledemo();
        demo.setSize(500,500);
        demo.setVisible(true);
        demo.setTitle("Tables");
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}