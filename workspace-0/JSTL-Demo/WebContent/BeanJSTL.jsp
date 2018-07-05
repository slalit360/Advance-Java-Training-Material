<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page import = "com.beans.Login" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="login" class="com.beans.Login">
<jsp:setProperty name="login" property="userName" value="Accenture"/>
</jsp:useBean>

<h2>
<%session.setAttribute("loginDetails",login);

  Login login1=(Login)session.getAttribute("loginDetails");
  out.print(login1.getUserName());

%> 
<br><br>

<c:out value="${loginDetails.userName}"/>

</h2>

</body>
</html>