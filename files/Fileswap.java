import javax.swing.JOptionPane;
class Fileswap
{
    public static void main(String args[])
    {
        int a=0,b=0,temp;

        a=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));

        JOptionPane.showMessageDialog(null,"Before swapping: "+a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;

        JOptionPane.showMessageDialog(null,"After Swapping: "+a+ " "+b);
    }
}