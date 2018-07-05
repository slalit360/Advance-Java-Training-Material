<html>
<head>
<title>One JSP</title>
</head>
<body>
<%
	String uname = request.getParameter("username");
	if (uname == null || uname.length() == 0) {
%>
<h2 align="center" style="background-color: red">Mandatory field
UserName missing...</h2>
<br>
<br>
<hr>
<a href="forwardHTML.html"> Click to go back to input page</a>
<%
	} else {
		
		int i=10;
%>


<jsp:forward page="forwardJSP2.jsp">
	<jsp:param value="<%=i %>" name="extraParameter" />
</jsp:forward>

<%
	}
%>
</body>
</html>