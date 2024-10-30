import java.awt.*;
import java.awt.event.*;
class Buttons1 extends Frame implements ActionListener
{
        Button b1,b2,b3;
    Buttons1()
    {
        this.setLayout(null);

        b1=new Button("Yellow");
        b2=new Button("Red");
        b3=new Button("Green");

        b1.setBounds(100,100,70,40);
        b2.setBounds(100,160,70,40);
        b3.setBounds(100,220,70,40);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    

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
        String str=ae.getActionCommand();

        if(str.equals("Yellow"))
            this.setBackground(Color.yellow);
        if(str.equals("Red"))
            this.setBackground(Color.red);
        if(str.equals("Green"))
            this.setBackground(Color.green);
    }


    public static void main(String args[])
    {
        Buttons1 b=new Buttons1();
        b.setSize(500,500);
        b.setTitle("Buttons");
        b.setVisible(true);
    }
}