<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Page 2</h1>
<%
String val=(String)session.getAttribute("name");
//String job=(String)request.getAttribute("job");


String valApp=(String)application.getAttribute("name");
%>
<%=val %>
<%=valApp %>

</body>
</html>