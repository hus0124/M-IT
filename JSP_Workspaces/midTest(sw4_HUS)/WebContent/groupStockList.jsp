<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "model.ProductDTO" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>    
<% List<ProductDTO> pageList = new ArrayList<ProductDTO>();
pageList = (List<ProductDTO>)request.getAttribute("stocklist");%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>그룹별 재고 수량</h2>
<table>
	<tr><td>그룹 이름</td>
		<td>재고 수량</td>		
	</tr>
<%
	for(int i = 0; i <pageList.size(); i++){ %>
		<tr><td><%= pageList.get(i).getPname() %></td>
		<td><%= pageList.get(i).getJnum() %></td>
		</tr>
<% } %>	
</table>
<input type = "button" value = "메인화면" onclick = "location.href='mainMenu.jsp'">
</body>
</html>