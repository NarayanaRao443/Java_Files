/*class Mythread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}

class Demo1
{
    public static void main(String args[])
    {
        Mythread ob=new Mythread();
        Thread t=new Thread(ob);
        t.start();
    }
}
*/

import java.io.*;
class Mythread extends Thread
{
    boolean stop = false;

    public void run()
    {
        for(int i=1;i<=10000;i++)
        {
            System.out.println(i);
            if(stop)
                return;
        }
    }
}

class Demo1
{
    public static void main(String args[]) throws IOException
    {
        Mythread ob=new Mythread();
        Thread t=new Thread(ob);
        t.start();

        System.in.read();
        ob.stop=true;
    }
}