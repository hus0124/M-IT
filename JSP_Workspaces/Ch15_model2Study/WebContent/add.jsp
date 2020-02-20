<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "sum" method="get"> <!-- sum 이라는 이름의 서블릿을 요청하는 것. add.jsp의 정보를 sum 서블릿으로 보낸다 -->
<input type = "text" name = "num1">&nbsp;+&nbsp;
<input type = "text" name = "num2"><br>
<input type = "submit" value = "계산">
</form>
</body>
</html>