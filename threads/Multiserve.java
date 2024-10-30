import java.io.*;
import java.net.*;
class MultiServe implements Runnable
{
    static ServerSocket ss;
    static Socket s;

    public void run()
    {
        String name=Thread.currentThread().getName();
        for(;;)
        {
            try
            {
                System.out.println("Thread "+name+ " ready to accept...");
                s=ss.accept();
                System.out.println("Thread "+name+" accepeted a connection");

                //for sending message
                printStream ps=new printStream(s.getOputputStream());
                ps.println("Thread "+name+" contacted yout");

                //close connection
                ps.close();
                s.close();
            }

            catch(Exceptino e)
            {

            }
            
        }
    }
}

public static void main(String args[]) throws IOException
{
    MultiServe ms=new MultiServe();
    ss=new ServerSocket(999);

    Thread t1=new Thread(ms,"One");
    Thread t2=new Thread(ms,"Two");

    t1.start();
    t2.start();
}