package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<h2>Session Servlet-1</h2>");
		
		HttpSession hs=request.getSession();
		String nm=(String) hs.getAttribute("Name");
		pw.print("<h3> hello, "+ nm +".</h3>");
		
		pw.print("<a href='Sessionservlet2?name="+nm+"'>click</a>");
		pw.print("</br> <a href='session'>Back</a>");
	}

}
