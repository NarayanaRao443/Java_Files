import java.awt.*;
import java.awt.event.*;
class Buttons extends Frame implements ActionListener
{
    Button b1,b2,b3;

    Buttons()
    {
        this.setLayout(new FlowLayout());

        //Create Buttons
        b1=new Button("Yellow");
        b2=new Button("Blue");
        b3=new Button("Pink");

        //Set the Buttons location
        b1.setBounds(100,100,100,40);
        b2.setBounds(100,160,100,40);
        b3.setBounds(100,220,100,40);

        //Adding Buttons to the Frame
        this.add(b1);
        this.add(b2);
        this.add(b3);

        //Addding Action Listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        //Clsoing the Frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    //For Button clicking
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();

        if(str.equals("Yellow"))
            this.setBackground(Color.yellow);
        if(str.equals("Blue"))
            this.setBackground(Color.blue);
        if(str.equals("Pink"))
            this.setBackground(Color.pink);
    }
    public static void main(String args[])
    {
        Buttons b=new Buttons();
        b.setSize(500,500);
        b.setTitle("Buttons");
        b.setVisible(true);
    }
}