<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page errorPage = "errorProcessing.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String name = request.getParameter("name");
	
	try {  
		if(name.equals("abc")){ %>
		abc다 <% } %>
	<% } 
	
	catch(Exception e) { 
		//e.printStackTrace();
		throw new NullPointerException();
	}
	finally{}
	%>

</body>
</html>