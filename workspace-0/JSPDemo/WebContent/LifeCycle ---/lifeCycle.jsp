<html>
<body>
<%!

	private int classVariable;

	public void jspInit() {
		System.out.println("inside init() = " + classVariable);

	}

	public void jspDestroy() {	}
%>


<%
// service method
	System.out.println("service" );
    out.print("<h3>" + ++classVariable + " Times</h3>");
		
%>

</body>
</html>

