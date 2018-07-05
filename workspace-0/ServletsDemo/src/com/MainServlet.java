package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;


public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		out.print("<h1>Main Servlet</h1>");
		out.print("<h1>"+uname+" :- "+pass+"</h1>");
		out.print("<a href='javascript_login.html'>click</a>");
		/*
		int salary=15000;
		List<String> nmList=new ArrayList<String>();
		nmList.add("Lalit");
		nmList.add("Ajit");*/
		
		RequestDispatcher rd=request.getRequestDispatcher("include");
		//request.setAttribute("sal", salary);
		//request.setAttribute("nmList", nmList);
		rd.include(request, response);
		
		out.print("Main Completed");
		
	}

}
