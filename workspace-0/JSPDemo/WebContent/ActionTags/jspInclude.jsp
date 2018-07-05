<HTML>
<HEAD>
	<TITLE>My Company's Home Page</TITLE>
</HEAD>
<BODY BGCOLOR="#00DDDD">
<H1>
Welcome, our current stock price is

<jsp:include page = "jspIncluded.jsp" >
	<jsp:param value="20" name="amount" />
</jsp:include>

</H1>
<BR>
<BR>
<BR>
<BR>

<FONT face ="Maiandra GD" color = "#FFFFFF" ><H3 ><I>
Here the output of "jspIncluded.jsp" is displayed (included) using 
<em> "jsp:include" </em> directive element.</I>
</H3></FONT>
</BODY>
</HTML>
