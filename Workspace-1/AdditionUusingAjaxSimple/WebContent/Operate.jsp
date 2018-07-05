<%
	
	String btnPress = request.getParameter("btnPress");
	if (request.getParameter("firstNo") != null && request.getParameter("secondNo") != null) {
		Integer firstNo = Integer.parseInt(request.getParameter("firstNo"));
		Integer secondNo = Integer.parseInt(request.getParameter("secondNo"));
		
		String sum = "";

			if(btnPress.equals("ADD")){
				
			sum += (firstNo + secondNo);
			}
			else if(btnPress.equals("SUB")){
				sum += (firstNo - secondNo);
			}
		
	
		
		response.getWriter().write(sum);
	} else {
		//nothing to show
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}

	

%>