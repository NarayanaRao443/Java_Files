import java.io.*;

class Readfile
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin=new FileInputStream("myfile3.txt");
        System.out.println("File contains:----");

        int ch;
        while((ch=fin.read())!=-1)
            System.out.print((char)ch);
            fin.close();
    }
}