class Exception2
{
    public static void main(String args[])
    {
        int a=5;
        try
        {
            a=Integer.parseInt(args[0]);
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Invalid Format");
        }
        catch(ArrayIndexOutofBoundsException ae)
        {
             System.out.println(ae);
            System.out.println("Invalid Index");
        }
        catch(Exception e)
        {
            System.out.println("some error");
        }
        System.out.println("Square is:"+Math.pow(a,2));
    }
}