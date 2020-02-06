<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Request 예제입니다.</h1>
<form action = "requestTest1.jsp" method="post">
이름&emsp;<input type = "text" name = "name"><br>
성별&emsp;남&nbsp;<input type = "radio" name = "gender" value="male">&nbsp;
여&nbsp;<input type = "radio" name = "gender" value="female"><br>
취미&emsp;독서&nbsp;<input type = "checkbox" name = "hobby" value = "book">&nbsp;
게임&nbsp;<input type = "checkbox" name = "hobby" value = "game">&nbsp;
TV시청&nbsp;<input type = "checkbox" name = "hobby" value = "tv">&nbsp;
축구&nbsp;<input type = "checkbox" name = "hobby" value = "soccer">&nbsp;
기타&nbsp;<input type = "checkbox" name = "hobby" value = "etc">&nbsp;<br>
<input type = "submit" value = "전송">
</form>
</body>
</html>