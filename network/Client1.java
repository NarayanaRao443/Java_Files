/*
import java.io.*;
import java.net.*;
class Client1
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",777); //creating client socket with same port number
        InputStream ob=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(ob));
        String str;
        while((str=br.readLine())!=null)
            System.out.println("From server: "+str);
            br.close();
            s.close();
    }
}
*/
import java.io.*;
import java.net.*;
class Client1
{
    public static void main(String args[]) throws Exception
    {
        int ch;
        Socket sc=new Socket(" 192.168.43.117",5000);

        InputStream in=sc.getInputStream();
        OutputStream out=sc.getOutputStream();
        String str="RGUKT\n";
        byte buf[]=str.getBytes();
        out.write(buf);

        while((ch=in.read())!=-1)
        {
            System.out.println((char)ch);
        }
        sc.close();
    }
}