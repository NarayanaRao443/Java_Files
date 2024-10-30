import java.io.*;
import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Chatserver extends JFrame 
{
    JTextArea ta1,ta2;
    JButton b1,b2;
    String s1="";
    JScrollPane p1,p2;
    JLabel l1,l2;

    public static int bs=1024;
    public static ServerSocket ss;
    public static Socket cs;
    public static byte buffer[]=new byte[bs];
    ObjectOutputStream os;
    ObjectInputStream is;

    Chatserver(String s) throws Exception
    {
        super(s);
        ss=new ServerSocket(2000,20);
        setLayout(new FlowLayout());
        add(l1=new JLabel("Typed Message :"));

        ta1=new JTextArea(8,36);
        p1=new JScrollPane(ta1);
        getContentPane().add(p1);
        add(l2=new JLabel("Received:"));

        ta2=new JTextArea(8,36);
        p2=new JScrollPane(ta2);
        getContentPane().add(p2);

        add(b1=new JButton("Send"));
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    os=new ObjectOutputStream(cs.getOutputStream());
                    s1="Server :"+ta1.getText();
                    os.writeObject(s1);
                    os.flush();
                    ta2.append("\n" +s1);
                    ta1.setText(" ");
                }
                catch(Exception e)
                {

                }
            }
        });
        add(b2=new JButton("Cancel"));
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cs=ss.accept();
        while(true)
        {
            is=new ObjectInputStream(cs.getInputStream());
            s1=(String)(is.readObject());
            ta2.append("\n" + s1);
        }
        
        
    }



    public static void main(String args[]) throws Exception
    {
       Chatserver f1=new Chatserver("SERVER");
    }
}

