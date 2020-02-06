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
String pagefile = request.getParameter("page");

	if(pagefile==null){
	pagefile="bestitem";}%>

	<table>
		<tr>
			<td colspan="3"><jsp:include page="top.jsp"/></td>
		</tr>
		<tr>
			<td><jsp:include page="left.jsp"/></td>
			<td colspan="2"><jsp:include page= '<%=pagefile+".jsp" %>'/>
		</tr>
		<tr>
			<td colspan="3"><jsp:include page="bottom.jsp"/>
		</tr>
		
	</table>
</body>
</html>