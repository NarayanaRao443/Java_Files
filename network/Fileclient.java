import java.io.*;
import java.net.*;

class Fileclient
{
    public static void main(String args[]) throws Exception
    {
        //create Client socket
        Socket s=new Socket("localhost",8888);
        //accept filename from keyboard
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter filename:");
        String fname=kb.readLine();

        //send filename to the server using DataoutputStream
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        out.writeBytes(fname+"\n");

        //to read data coming from the server
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str;
        str=in.readLine();

        if(str.equals("Yes"))
        {
            while((str=in.readLine())!=null)
            System.out.println(str);

            kb.close();
            out.close();
            in.close();
            s.close();
        }

        else
            System.out.println("File not found");
    }
}