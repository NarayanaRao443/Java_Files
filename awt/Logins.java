import java.awt.*;
import java.awt.event.*;
class Logins extends Frame implements ActionListener
{
    TextField name,pass;

    Logins()
    {
        setLayout(new FlowLayout());

        //Create two labels
        Label n=new Label("Name:  ", Label.LEFT);
        Label p=new Label("Password: ",Label.LEFT);

        //Create TextFields
        name=new TextField(10);
        pass=new TextField(10);

        //for hiding the password by *
        pass.setEchoChar('*');

        name.setBackground(Color.yellow);
        name.setForeground(Color.red);
        Font f=new Font("Arial", Font.PLAIN,25);
        name.setFont(f);

        //add the labels and textfieds to frame
        add(n);
        add(name);
        add(p);
        add(pass);

        //add action listener to text fields

        name.addActionListener(this);
        pass.addActionListener(this);

        //closing the frame

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        Graphics g=this.getGraphics();
        g.drawString("Name: "+name.getText(), 10,100);
        g.drawString("Pass: "+pass.getText(),10,100);
    }

    public static void main(String args[])
    {
        Logins lb=new Logins();
        lb.setTitle("Login Page");
        lb.setSize(500,500);
        lb.setVisible(true);
    }
}