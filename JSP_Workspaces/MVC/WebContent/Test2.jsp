<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
보낸 값은 <%=request.getParameter("num") %>입니다.<br>
보낸 값을 10번 더한 값은 <%=request.getAttribute("sum") %> 입니다.
</body>
</html>