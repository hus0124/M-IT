<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<b>안녕하세요 JSP</b><br><br>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
%>

<b>입력하신 아이디는 : </b><%=id %><br>
<b>입력하신 패스워드 : </b><%=pw %>
</body>
</html>