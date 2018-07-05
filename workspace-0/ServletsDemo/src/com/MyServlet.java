package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
	
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		out.print("<h1>My Servlet</h1>");
		out.print("<h1>"+uname+" :- "+pass+"</h1>");
		
		int sal=(Integer) request.getAttribute("sal");
		out.print("<h4>Salary : "+sal+"</h4>");
		
		List<String> nm=(List<String>) request.getAttribute("nmList");
		out.print("<h2>THIS IS MY LIST</h2>");
		for (Iterator iterator = nm.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			out.print("<h3>"+string+"</h3>");
			
		}
	}
}

