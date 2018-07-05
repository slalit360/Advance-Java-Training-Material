

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class AsyncServlet
 */
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String uid=req.getParameter("userid");
		PrintWriter out=res.getWriter();

		try {
			System.out.println("in service");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ajaxdb","root","root");
			
			String sql="select uname from login where uname=?";
			
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1, uid);
			ResultSet rs=statement.executeQuery();
			System.out.println(rs);
			
			if (rs.next()) 
			{
				out.println("<font color=blue size=12px> USER ID EXIST</font>");
			}else 
			{
				out.println("<font color=red size=12px> USER ID DOES NOT EXIST</font>");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
