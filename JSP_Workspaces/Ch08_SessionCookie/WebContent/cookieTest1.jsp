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
	Cookie cookie = new Cookie("name","honggildong");
	cookie.setMaxAge(60); // 60초
	response.addCookie(cookie);
%>
<%=cookie.getName() %><br>
<%=cookie.getValue() %><br>
<%=cookie.getMaxAge() %><br>
<a href = "cookieTest2.jsp">쿠키 값 불러오기</a>
</body>
</html>