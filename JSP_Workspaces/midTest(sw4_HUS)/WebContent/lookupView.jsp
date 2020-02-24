<%@page import="model.ReadOneDAO"%>
<%@page import="model.ReadOneDAOlmpl"%>
<%@page import="model.ProductDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ProductDTO dto = new ProductDTO(); 
	dto = (ProductDTO)request.getAttribute("dto2");
%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>조회화면</h2>
제품코드 : <%=dto.getCode()%><br>
제품이름 : <%=dto.getPname()%><br>
제품원가 : <%=dto.getCost()%><br>
목표수량 : <%=dto.getPnum()%><br>
재고수량 : <%=dto.getJnum()%><br>
출고가 : <%=dto.getSale()%><br>
그룹코드 : <%=dto.getGcode()%><br>

<a href="lookupEdit.jsp">조회 & 수정 화면 돌아가기</a>
</body>
</html>