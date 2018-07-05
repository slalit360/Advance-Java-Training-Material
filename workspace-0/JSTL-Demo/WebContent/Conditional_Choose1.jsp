<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="age" value="70"/>
<c:choose>
	<c:when test="${age >= 65 }">
		<h3> Special interest rates for Senior Citizen 12.5 </h3>
	</c:when>
	<c:when test="${age >=60 or age <65}">
		<h3> Special interest rate 11.5 </h3>
	</c:when>
	<c:otherwise>
		<h3> Regular Rate of interest is 10.0 </h3>
	</c:otherwise>
</c:choose>


</body>
</html>