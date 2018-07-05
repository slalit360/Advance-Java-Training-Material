package com;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	public  boolean authenticate(String uname ,String pass)
	{
			Connection conn=null;
			try
			{
				conn=new DBConnection().makeConnection();
				String sql="select * from login where uname=? and pass=?";
				
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1,uname);
				ps.setString(2,pass);
				ResultSet rs=ps.executeQuery();
				 
					if( rs.next() )
					{
						return true;
					}	
			}
			catch (SQLException e) 
			{
				System.out.println(e);
			}
			finally
			{
				try 
				{
					if (conn != null) 
					{
						conn.close();
					}
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
		}
			return false;	
		

	}

	public static void main(String[] args) {
		LoginDAO a=new LoginDAO();
		boolean rs=a.authenticate("system", "admin");
		System.out.println(rs);
		
		
	}
	
}
