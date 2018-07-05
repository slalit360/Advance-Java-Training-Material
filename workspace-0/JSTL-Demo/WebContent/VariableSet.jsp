<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      
<body>

<c:set var="name" value="Jack" scope="session"/>

<c:set var="salary" value="${30*1500}" />

 <h2>
  
 <c:out value="100" /> <br>
 <c:out value="${name}" /> <br>
  <c:out value="${salary}" />

<a href="VariableSession.jsp"> Click Here </a>
</h2>
</body>
</html>