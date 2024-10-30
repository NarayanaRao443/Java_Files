import java.io.*;
import java.lang.*;
class Readfile2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file name:");
        String fname=br.readLine();
        FileInputStream fin=null;

        try
        {
            fin=new FileInputStream(fname);
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
            return;
        }
        BufferedInputStream bin=new BufferedInputStream(fin);
        System.out.println("File contains:----");
        
        int ch;
        while((ch=bin.read())!=-1)
        System.out.print((char)ch);
        bin.close();
    }
}