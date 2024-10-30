import java.io.*;
import java.util.zip.*;
class Zip
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis=new FileInputStream("file1");
        
        FileOutputStream fos=new FileOutputStream("file2");
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);
        int data;
        while((data=fis.read())!=-1)
            dos.write(data);
            fis.close();
            dos.close();
    }
}