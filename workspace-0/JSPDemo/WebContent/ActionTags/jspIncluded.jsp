
<html>
<font color="red">
<%
	int amount=Integer.parseInt(request.getParameter("amount"));

%>
<%=amount %>
<br>
<%
	
out.print(1000 * Math.random());
%>
</font>
</html>