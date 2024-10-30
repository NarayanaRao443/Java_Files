    
import java.sql.*;
class Mysql
{
    public static void main(String args[])
    {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/school?useSSl=false";
        String username="root";
        String password="knr443";


        try
        {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into student values('raj','Kumar',130396,'E4')");
            System.out.println("Connection successful");
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}