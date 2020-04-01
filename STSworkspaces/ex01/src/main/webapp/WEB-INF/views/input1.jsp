<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/add" method="get">
	A : <input type="text" name = "numA">&emsp;
	B : <input type="text" name = "numB"><br>
	<input type="submit" value="더해라">
</form>

<br>
객체 형태로 받아보기<br>
<form action="/add1" method="get">
	A : <input type="text" name = "num1">&emsp;
	B : <input type="text" name = "num2"><br>
	<input type="submit" value="더해라">
</form>

</body>
</html>