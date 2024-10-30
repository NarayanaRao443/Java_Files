// import java.io.*;
// class Filereader
// {
//     public static void main(String args[]) throws IOException
//     {
//         int ch;
//         FileReader fr=null;
//         try
//         {
//             fr=new FileReader("text");
//         }

//         catch(FileNotFoundException fe)
//         {
//             System.out.println("File not found");
//             return;
//         }

//         while((ch=fr.read())!=-1)
//             System.out.print((char)ch);
//             fr.close();

//     }
// }

import java.io.*;
/**
 * Filereader
 */
public class Filereader {

    public static void main(String[] args) throws IOException {
        
        int ch;
        FileReader fr =null;

        try
        {
            fr = new FileReader("myfile.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
            return;
        }

        //char ch;

        while((ch = fr.read())!=-1)
            System.out.print((char)ch);
            fr.close();
    }
}