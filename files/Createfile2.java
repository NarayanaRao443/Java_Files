import java.io.*;
class Createfile2
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("myfile2.txt",true);

        BufferedOutputStream bout=new BufferedOutputStream(fout,1);
        System.out.println("Enter text (@ at the end):");

        char ch;

        while((ch=(char)dis.read())!='@')
            bout.write(ch);
            bout.close();
    }
}

