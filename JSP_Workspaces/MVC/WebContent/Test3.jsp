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
int a = Integer.parseInt(request.getParameter("num1"));
int b = Integer.parseInt(request.getParameter("num2"));

if (a < b){
%>
<%=request.getParameter("num1") %>부터 <%=request.getParameter("num2") %>까지 홀수만 더한 값은 <%=request.getAttribute("sum") %> 입니다.
<%} else { %>
<%=request.getParameter("num2") %>부터 <%=request.getParameter("num1") %>까지 홀수만 더한 값은 <%=request.getAttribute("sum") %> 입니다.
<%} %>
</body>
</html>