/*
import javax.swing.*;
class Jframes1
{
    public static void main(String args[])
    {
        JFrame ob=new JFrame("My JFrame");
        ob.setSize(500,500);
        ob.setVisible(true);
    }
}
*/
/*
import javax.swing.*;
class Jframes1 extends JFrame
{
    public static void main(String args[])
    {
        Jframes1 ob=new Jframes1();
        ob.setTitle("My Jframes");
        ob.setSize(500,500);
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/

import javax.swing.*;
import java.awt.*;
class Jframes1 extends JFrame
{
    public static void main(String args[])
    {
        Jframes1 ob=new Jframes1();

        Container c=ob.getContentPane();
        c.setBackground(Color.green);
        ob.setSize(500,500);
        ob.setTitle("my JFrames");
        ob.setVisible(true);
    }
}