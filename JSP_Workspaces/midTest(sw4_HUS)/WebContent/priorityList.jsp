<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "model.ProductDTO" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>    
<% List<ProductDTO> pageList = new ArrayList<ProductDTO>();
pageList = (List<ProductDTO>)request.getAttribute("plist");%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>우선순위 리스트</h2>
<table>
	<tr><td>제품이름</td>
		<td>생산해야 할 수량</td>		
	</tr>
<%
	for(int i = 0; i <pageList.size(); i++){ %>
		<tr><td><%= pageList.get(i).getPname() %></td>
		<td><%= pageList.get(i).getCost() %></td>
		</tr>
<% } %>	
</table>
<input type = "button" value = "메인화면" onclick = "location.href='mainMenu.jsp'">
</body>
</html>