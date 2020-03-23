<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var = "test1" value = "Hello JSTL!" />
	
	<c:out value="${test1 }" default="없다"></c:out>
	
	<c:remove var="test1"/><br>

	<c:out value="${test1 }" default="없다"></c:out>
	
	<c:catch var = "err"><br>
	<%=10/0 %></c:catch>
	
	<c:out value = "${err }" /><br>
	
	<c:if test = "${5<10 }">5가 10보다 작은 거 맞음</c:if>
	<br>
	<c:if test = "${5>10 }">5가 10보다 큰 거 맞음</c:if>
	<br>
	
	<c:choose>
		<c:when test="${5+10==50 }">이건 거짓인데</c:when>
		<c:otherwise>5+10은 50이 아니다</c:otherwise>
	</c:choose><br>	
	
	<c:forEach var="test" begin="1" end="10" step="2">${test }<br></c:forEach>
	
	
<br>
	<c:forTokens var="alphabet" items="a,b,c,d,e,f" delims=",">${alphabet }<br></c:forTokens>
</body>
</html>