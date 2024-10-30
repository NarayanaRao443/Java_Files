import java.io.*;
import java.net.*;

class Fileserver
{
    public static void main(String args[]) throws Exception
    {
        //For creating a server socket
        ServerSocket ss=new ServerSocket(8888);

        //make the server wait till the client accepts connection
        Socket s=ss.accept();
        System.out.println("Connection established");

        //to accept file name from server
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //to send file contents to client
        DataOutputStream out=new DataOutputStream(s.getOutputStream());

        String fname=in.readLine();

        FileReader fr=null;
        BufferedReader file=null;
        boolean flag;

        File f=new File(fname);

        if(f.exists())
            flag=true;
        else 
            flag=false;

            if(flag==true)
                out.writeBytes("Yes"+"\n");
            else
                out.writeBytes("No"+"\n");
            
            if(flag==true)
            {
                fr=new FileReader(fname);
                file=new BufferedReader(fr);

                String str;
                while((str=file.readLine())!=null)
                {
                    out.writeBytes(str+"\n");
                }

                file.close();
                out.close();
                in.close();
                fr.close();
                s.close();
                ss.close();
            }
    }
}