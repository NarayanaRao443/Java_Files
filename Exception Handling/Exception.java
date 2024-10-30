import java.io.*;
class Exception
{
    public static void main(String args[])
    {
        int num=0;
        try
        {
            num=Integer.parseInt(args[]);
            
                if(num>25)
                {
                    BigException b=new BigException("Number too large");
                    throw b;
                }
        }
        catch(BigException be)
         {
           System.out.println(be.getMessage());
         }
        catch(NumberFormatException ne)
        {
          System.out.println("Invalid Format");
        }

        catch(Exception e)
        {
            System.out.println("Some Errors");
        }
          System.out.println("Square of num is:",+Math.pow(num,2));
            
        
    }
}