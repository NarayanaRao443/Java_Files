// import java.io.*;

// class Filewriter1
// {
//     public static void main(String args[]) throws IOException
//     {
//         String st="This is a book of Java."+"\n I am a learner of java. ";

//         FileWriter fw=new FileWriter("text.txt");
//         for(int i=0;i<st.length();i++)
//             fw.write(st.charAt(i));
//             fw.close();
//     }
// }

import java.io.*;
/**
 * Filewriter1
 */
public class Filewriter1 {

    public static void main(String[] args) throws IOException {
        
        String st = "This is a book "+"\n I am a learner of Java";

        FileWriter fw = new FileWriter("myfile3.txt");
        for(int i=0;i<st.length();i++)
            fw.write(st.charAt(i));
            fw.close();;
    }
}


