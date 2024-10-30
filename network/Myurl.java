import java.net.*;
class Myurl
{
    public static void main(String args[]) throws Exception
    {
        URL ob=new URL("http://www.google.com/index.html");

        System.out.println("Protocol: " +ob.getProtocol());
        
        System.out.println("Host: " +ob.getHost());
        
        System.out.println("File: " +ob.getFile());
        
        System.out.println("Port: " +ob.getPort());
        
        System.out.println("Path: " +ob.getPath());
        
        System.out.println("External Form: " +ob.toExternalForm());
    }
}