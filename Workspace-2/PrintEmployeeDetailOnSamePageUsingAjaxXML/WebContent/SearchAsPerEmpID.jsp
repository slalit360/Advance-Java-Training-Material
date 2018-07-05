<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<% 
	
	Class.forName("com.mysql.jdbc.Driver");   
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/EmployeeDB","root","root");
	
	PreparedStatement ps = con.prepareStatement("select * from employee where empid = ?");
	ps.setInt(1, Integer.parseInt(request.getParameter("empId")));
	ResultSet rs = ps.executeQuery();
	
	String empXml = null;
	response.setContentType("text/xml");
	response.setHeader("Cache-Control", "no-cache");
	empXml = "<?xml version='1.0' encoding='UTF-8'?>" +"<result>";
	while(rs.next())
	{
		empXml =  empXml + "<Employee>";
		empXml =  empXml + "<empId>" + rs.getInt("empid") + "</empId>";
		empXml =  empXml + "<empName>" + rs.getString("empName") + "</empName>";
		empXml =  empXml + "<baseLocation>" + rs.getString("baseLocation") + "</baseLocation>";	
		empXml =  empXml + "</Employee>";
	}
	empXml += "</result>";
	
	response.getWriter().write(empXml);
	//response.setStatus(HttpServletResponse.SC_OK);
	//out.flush();

%>