/*
class Exception1
{
    public static void main(String args[])
    {
        int a=10,b=0,c=20,d=0;
        d=a/b;
        System.out.println("c is:"+d);
    }
}
*/

class Exception1
{
    public static void main(String args[])
    {
        int a=10,b=0,c=20,d=0;

        try
        {
            d=a/b;
           
        }
        catch(ArithmeticException ae)
        {   
            ae.printStackTrace();
           System.out.println(ae);
            System.out.println("Pass the value to program");
        }
        System.out.println("d is:"+d);
    }
}