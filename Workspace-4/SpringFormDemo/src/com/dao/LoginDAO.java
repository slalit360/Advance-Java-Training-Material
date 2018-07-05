package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.helper.DBConnection;

@Component
public class LoginDAO {
	
	@Autowired
	public DBConnection dbConn;
	
	public boolean validateUser(String uname,String pwd)throws Exception{
		DataSource ds=dbConn.getConnSource();
		Connection c=ds.getConnection();
		PreparedStatement ps=c.prepareStatement("select * from login where username=? and password=?");
		ps.setString(1, uname);
		ps.setString(2, pwd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			return true;
		}else {
			return false;
		}
	}

}
