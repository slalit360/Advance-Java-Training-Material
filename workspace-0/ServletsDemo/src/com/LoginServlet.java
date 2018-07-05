package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LoginDAO a=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		
		a=new LoginDAO();
		
		if (uname==null || pass==null) 
		{
			response.sendRedirect("loginForm.html");
			
		}
		else
		{
			boolean res=a.authenticate(uname,pass);
			if (res) 
			{
				response.sendRedirect("success");
			} 
			else 
			{
				response.sendRedirect("failed.html");
			}
		}
	}

}
