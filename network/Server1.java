/*
import java.io.*;
import java.net.*;

class Server1
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(777);
        Socket s=ss.accept();
        System.out.println("Connection established");

        OutputStream ob=s.getOutputStream();

        PrintStream ps=new PrintStream(ob);

        String str="Hello Client";
        ps.println(str);
        ps.println("Bye");

        ps.close();
        ss.close();
        s.close();

    }
}
*/

import java.io.*;
import java.net.*;

public class Server1
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            ServerSocket ss=new ServerSocket(5000);
            Socket s=ss.accept();

            InputStream is=s.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader in=new BufferedReader(isr);
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            String str=in.readLine();
            out.println("Institute Name: "+str);
            s.close();
        }
        catch(Exception e)
        {

        }
    }
}