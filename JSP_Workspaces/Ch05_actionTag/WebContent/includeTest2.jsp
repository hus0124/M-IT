<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이것은 삽입된 페이지 인클루드 테스트 2 입니다<br>
<% request.setCharacterEncoding("UTF-8"); %>
<% String name = request.getParameter("name"); %>
<b><%=name %></b>
</body>
</html>