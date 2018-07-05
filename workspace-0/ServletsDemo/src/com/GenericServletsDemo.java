package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletsDemo extends GenericServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.print("<h1>welcome to Generic Programming!!</h1>");
		
	}
       
    

}
