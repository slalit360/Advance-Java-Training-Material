<html>
<head>
<title>Two JSP</title>
</head>
<body>
<h1>This output is displayed by ForwarJSP2.jsp, but check the URL.<br>
This is because of forwarding request.<br>
<br>
Hello <font color="red"><%=request.getParameter("username")%><br>
<br>

<u><%=request.getParameter("extraParameter")%></u></font></h1>


 

</body>
</html>