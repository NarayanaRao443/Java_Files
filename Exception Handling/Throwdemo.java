
class Sample
{
    static void demo()
    {
        try
        {
            System.out.println("Inside demo()");
            throw new NullPointerException("Exception data");
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne);
        }
    }
}

class Throwdemo
{
    public static void main(String args[])
    {
        Sample.demo();
    }
}