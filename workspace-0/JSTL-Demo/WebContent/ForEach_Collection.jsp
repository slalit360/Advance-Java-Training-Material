<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
     <%@page import="com.beans.CustomerBean" %>
      <%@page import="java.util.List" %>
       <%@page import="java.util.ArrayList" %>
       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	CustomerBean c1=new CustomerBean();
	c1.setName("Jack");
	c1.setCity("BLR");
	
	CustomerBean c2=new CustomerBean();
	c2.setName("John");
	c2.setCity("PUN");
	
	List<CustomerBean> customers=new ArrayList<CustomerBean>();
	customers.add(c1);
	customers.add(c2);
%>

    <table>
          <c:forEach var="rec" items="${customers}">
                <tr>
                    <td>
                        <c:out value="${rec.name}"/>
                    </td>
                <td>
                    <c:out value="${rec.city}"/>
                </td>
                </tr>
            </c:forEach>
        </table>

</body>
</html>