<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>
이름 <%=request.getParameter("name") %><br>
성별 <%
	String gender = request.getParameter("gender");
	if (gender.equals("male")){
	%>남자 <% } 
	else { %>여자 <% } %>	
	<br>취미 <%
		String[] hobby = request.getParameterValues("hobby");
		for (int i = 0; i < hobby.length; i++){ %>
			<%= hobby[i] %>&nbsp;
		<% } %>
	
	

</body>
</html>