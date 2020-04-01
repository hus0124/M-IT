<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- MVC_Controller에서 /test3로 맵핑되어 옴 -->
${prod.name }<br>
${prod.count }
<!-- 컨트롤러에서 model.addAttribute(product); 이었다면 productVO 즉 소문자로 시작하는 클래스 이름으로 읽어야 함.-->
</body>
</html>