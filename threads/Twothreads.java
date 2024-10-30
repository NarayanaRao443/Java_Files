class Mythread implements Runnable
{
    String str;
    Mythread(String str)
    {
        this.str=str;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(str+ " : "+i);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}

class Twothreads
{
    public static void main(String args[])
    {
        Mythread ob1=new Mythread("Cut the cake");
        Mythread ob2=new Mythread("Eat the all cakes");

        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);

        t1.start();
        t2.start();
    }
}