import java.sql.*;
class Oracledata
{
    public static void main(String args[]) 
    {
        try
        {
        Class.forName("oracle.jdbc.driver.OracleDriver");
      
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","knr443");

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emptab");

        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getFloat(3));
        }
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*
import java.sql.*;
class Oracledata
{
    public static void main(String args[]) throws Exception
    {
        String driver ="oracle.jdbc.driver.OracleDriver";
        String url="jdbc:oracle:thin:@localhost:1521/XE";
        String username="SYSTEM";
        String password="knr443";

        try
        {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into student values(1,'knr';)");
            con.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
*/