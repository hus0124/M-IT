<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	int flag=0;
	if (pw.equals("1234")){
		session.setAttribute("id", id);
		flag=1;
	}
	
	if(flag==0){ %>
	로그인 실패
	<% } else { %>
	로그인 성공<br>
	로그인 아이디 : <%=session.getAttribute("id") %><br>
	<a href = "sessionLogout.jsp">로그아웃</a>
	<a href = "testSession.jsp">로그인상태</a>
	<% } %>
</body>
</html>