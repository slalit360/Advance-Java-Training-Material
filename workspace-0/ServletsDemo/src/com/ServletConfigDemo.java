package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int i;
    
	/*public void init(ServletConfig config) throws ServletException 
	{
		String p=config.getInitParameter("MyValue");
		i=Integer.parseInt(p);
	}*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h2>I : "+i+"</h2> ");
		
		String j;
		//ServletConfig sc=getServletConfig();
		
		ServletContext sc=getServletContext();
		j=sc.getInitParameter("Param");
		out.print("<h1> J :"+j+"</h1>");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
