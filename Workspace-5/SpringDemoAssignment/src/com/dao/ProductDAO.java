package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helper.DBConnection;
import com.pojo.Product;
import com.pojo.ProductId;

@Component
public class ProductDAO {

	
	@Autowired
	public DBConnection dbConn;
	
	public boolean addProductDao(Product product)throws Exception
	{
		DataSource ds=dbConn.getConnSource();
		Connection c=ds.getConnection();
		
		PreparedStatement ps=c.prepareStatement("Insert into product values(?,?,?)");
		ps.setInt(1,product.getpId());
		ps.setString(2,product.getpName());
		ps.setDouble(3,product.getPrice());
		
		int rs=ps.executeUpdate();
		//product=null;
		if(rs>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	
	public List<ProductId> getupdateProductList() throws SQLException 
	{
		DataSource ds=dbConn.getConnSource();
		Connection c=ds.getConnection();
		
		List<ProductId> pList=new ArrayList<ProductId>();
		
		PreparedStatement ps=c.prepareStatement("Select pid,pname from product");
		ResultSet rs=ps.executeQuery();
		while (rs.next()) 
		{
			ProductId product=new ProductId();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			pList.add(product);
		}
		return pList;
	}
	
	public List<Product> getProductList() throws SQLException 
	{
		DataSource ds=dbConn.getConnSource();
		Connection c=ds.getConnection();
		
		List<Product> pList=new ArrayList<Product>();
		
		PreparedStatement ps=c.prepareStatement("Select * from product");
		ResultSet rs=ps.executeQuery();
		while (rs.next()) 
		{
			Product product=new Product();
			product.setpId(rs.getInt("pid"));
			product.setpName(rs.getString("pname"));
			product.setPrice(rs.getFloat("price"));
			pList.add(product);
		}
		return pList;
	}

	public boolean updateProductDao(Product product) throws SQLException 
	{
		DataSource ds=dbConn.getConnSource();
		Connection c=ds.getConnection();
		
		PreparedStatement ps=c.prepareStatement("update product set price=? where pid=?");
		ps.setInt(2,product.getpId());
		ps.setDouble(1,product.getPrice());
		
		int rs=ps.executeUpdate();
		if(rs>0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
