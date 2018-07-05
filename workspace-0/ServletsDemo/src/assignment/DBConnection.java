package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost/lalitdb";
	String uname="root";
	String pwd="root";
	Connection conn=null;
	
	public Connection makeConnection() 
	{
		try
		{
			Class.forName(driver);// load driver
			conn=DriverManager.getConnection(url,uname,pwd);  //"jdbc:mysql://localhost_or_IP/lalitdb(database name)","root(userid)","root(password)"
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}catch (SQLException e1) 
		{
			System.out.println(e1);
		}
		return conn;
	}
}
