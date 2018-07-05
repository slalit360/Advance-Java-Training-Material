<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String uname=request.getParameter("uname");
	String gen=request.getParameter("gender");
	String dd=request.getParameter("drop");
%>
<h1><%=uname%></h1>
<h1><%=gen%></h1>
<h1><%=dd%></h1>
</body>
</html>