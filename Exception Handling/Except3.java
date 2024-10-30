import java.io.*;
import java.lang.*;
class Sample
{
    private String name;

    void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name:");
        name=br.readLine();
    }

    void display()
    {
        System.out.println("name is:"+name);
    }
}

class Except3
{
    public static void main(String args[]) throws IOException
    {
        Sample s=new Sample();
        s.accept();
        s.display();
    }
}