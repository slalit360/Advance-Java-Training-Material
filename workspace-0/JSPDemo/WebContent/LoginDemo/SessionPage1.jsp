<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Page 1</title>
</head>
<body>
<h1>Page 1</h1>

<%
	String a="Accenture";
	
	session.setAttribute("name", a);
	application.setAttribute("name", a);
%>
<a href="SessionPage2.jsp?job='lalit'">Page 2</a>
</body>
</html>