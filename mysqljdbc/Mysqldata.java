// set classpath=%classpath%;mysql-connector-java-8.0.28.jar;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Mysqldata
{
    public static void main (String args[])
    {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="knr443";
      //  String sql="select fname, lname,sid,class "+ "from student";

        try
        {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();

            int norows=stmt.executeUpdate("delete from  student where sid=77777");
            System.out.println("no of rows affected="+ norows);

           // norows=stmt.executeUpdate("insert into student values('jkjkjkj','dhhd',98989,'P1')");
            //System.out.println("no of rows affected="+ norows);
            ResultSet rs=stmt.executeQuery("select fname, lname,sid,class from student");

           
           // stmt.executeUpdate("insert into student values('kkkk','lll',12383,'E1')");
            
            while(rs.next())
            {
                System.out.println(rs.getString("FName")+ "\t" + rs.getString("LName")+ "\t" +rs.getString("SID")+ "\t" +rs.getString("class"));
            }
            System.out.println("Connection Successful");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}

