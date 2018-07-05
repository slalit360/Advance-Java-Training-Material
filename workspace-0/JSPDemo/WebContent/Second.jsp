<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second JSP Page</title>
</head>
<body>

<%
	int i=-100;

	if(i >0)
	{
%>
<h1 style="color: green;">Positive</h1>
<%	}else{ %>
<h1 style="color: red;">Negative</h1>
<%	} %>
</body>
</html>