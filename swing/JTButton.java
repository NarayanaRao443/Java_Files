import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JTButton extends JFrame implements ActionListener
{
    JToggleButton btn;
    ImageIcon img;
    JProgressBar bar;
    JButton b,b1,b2,b3,b4;
    String str;
    JLabel lb;
    JToolBar tb;
    Container c;

    JTButton()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());

        tb=new JToolBar();
        tb.setBorder(BorderFactory.createEtchedBorder(Color.green,Color.blue));
        ImageIcon img3,img4,img5;

        img3=new ImageIcon("img1.gif");
        img4=new ImageIcon("img2.gif");
        img5=new ImageIcon("img3.gif");

        b1=new JButton(img3);
        b2=new JButton(img4);
        b3=new JButton(img5);

        b4=new JButton("Select a color");
        c.add(b4);
        b4.addActionListener(this);

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);

        c.add("North",tb);

        lb=new JLabel();
        lb.setFont(new Font("SansSerif", Font.PLAIN,30));
        c.add("Center",lb);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        img=new ImageIcon("start.gif");
        btn=new JToggleButton("Start/Stop");
        btn.setBounds(100,30,50,40);
        c.add(btn);
        btn.addActionListener(this);

        b=new JButton("click repeatedly");
        bar=new JProgressBar();
        bar.setForeground(Color.red);
        bar.setStringPainted(true);
        c.add(b);
        c.add(bar);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon img2=new ImageIcon("stop.gif");
        if(btn.isSelected())
            btn.setIcon(img2);
        else
            btn.setIcon(img);

        bar.setValue(bar.getValue()+10);

        Color selectedColor=null;
        Color col=JColorChooser.showDialog(this,"Select a color",selectedColor);

        if(col!=null)
        {
            selectedColor=col;
        }

       c.setBackground(col);
    }

    public static void main(String args[])
    {
        JTButton de=new JTButton();
        de.setSize(400,400);
        de.setTitle("Toggle Button");
        de.setVisible(true);
    }
}