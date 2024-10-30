import java.io.*;
class Createfile
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);

        FileOutputStream fout=new FileOutputStream("myfile.txt",true);
        //if true is not there the data will be replaced with new data.
        //if true is there data won't be replace. It can store new data in the file.
        System.out.println("Enter text (@ at the end):");
        char ch;
        while((ch=(char)dis.read())!='@')
        fout.write(ch);
        fout.close();
    }
}

