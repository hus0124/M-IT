<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Random"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석은 브라우저 상에서 소스 코드 살펴보면 그대로 보인다 -->
	<%-- JSP 주석은 브라우저 상에서 소스 코드 봐도 안 보인다 --%>
	
	<%! // 자바 내에선 자바 주석 스타일 
		/* 이것도 자바 
		주석 스타일 */
		//선언문
		private String str = "JSP스터디";
		public String checkstr(){
			return "ok";
		}
	%>
	
	<%
		//스크립트
		Random random = new Random();
		int lotto = random.nextInt(100)+1;
	
	%>
	랜덤랜덤은 <%=lotto %><br>
	<%=str %> 시간은 언제입니다.<br>
	<%=checkstr() %>?<br>
	<%@ include file = "footer.jsp" %>
</body>
</html>