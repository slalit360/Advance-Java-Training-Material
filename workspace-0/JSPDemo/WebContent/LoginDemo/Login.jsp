<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@page import="com.LoginDAO" %>

<%
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	boolean flag=new LoginDAO().authenticate(uname, pass);
	if(flag)
	{
		//out.print("Login Success");
		response.sendRedirect("success.html");
	}
	else
	{
		//out.print("Login Failed");
		response.sendRedirect("failed.html");
	}
%>
</body>
</html>