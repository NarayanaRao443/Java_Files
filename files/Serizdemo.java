import java.io.*;
import java.util.*;

    class Box implements Serializable
    {
        private double width;
        private double height;
        private double depth;

        Box()
        {
            width=0;
            height=0;
            depth=0;
        }

        Box(double w,double h,double d)
        {
            width=w;
            height=h;
            depth=d;
        }

        void display()
        {
            System.out.println("Width= "+width);
            System.out.println("Height= "+height);
            System.out.println("Depth= "+depth);
        }
    }
class Serizdemo
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        double w=0.0,h=0.0,d=0.0;
        System.out.print("Enter Width,height and depth: ");

        w=Double.parseDouble(br.readLine());
        h=Double.parseDouble(br.readLine());
        d=Double.parseDouble(br.readLine());

        Box b1=new Box(w,h,d);

        FileOutputStream fos=new FileOutputStream("ObjFile");

        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(b1);
        oos.close();

    }
}