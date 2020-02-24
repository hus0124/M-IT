<%@page import="model.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% ProductDTO pageDTO = new ProductDTO();
   pageDTO = (ProductDTO)request.getAttribute("dto_A");
   String str = null;
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>생산관리 조회 & 수정화면</title>
</head>
<body>
<h2>생산관리 조회 & 수정화면</h2>

	<fieldset>
		<legend>생산관리 조회화면</legend>
<%if (pageDTO == null) { %>		
		    <form name = "searchform" action ="searchform.edit" method = "post">
			<ul><table>
				<tr><td><li>제품코드</li></td><td><input type = "text" name = "productCode" required = "required"></td></tr>
				<tr><td><li>제품이름</li></td><td><input type = "text" name = "productName"></td></tr>
				<tr><td><li>제품원가</li></td><td><input type = "text" name = "productPrice"></td></tr>
				<tr><td><li>목표수량</li></td><td><input type = "text" name = "targetQuantity"></td></tr>
				<tr><td><li>재고수량</li></td><td><input type = "text" name = "availableStock"></td></tr>
				<tr><td><li>출고가</li></td><td><input type = "text" name = "shippingPrice"></td></tr>
				<tr><td><li>그룹이름</li></td>
				<td><select name = "groupName">
					<option value = "A">컴퓨터</option>
					<option value = "B">냉장고</option>
					<option value = "C">냉장소모품</option></select>
				</td></tr>
			</table></ul></form>
<%} else { %>  
			<form name = "searchform" action ="searchform.edit" method = "post">
			<ul><table>
				<tr><td><li>제품코드</li></td><td><input type = "text" name = "productCode" value = <%=pageDTO.getCode() %>></td></tr></form>
			<form name = "updateform" action = "updateform.edit" method = "post">
			<input type="hidden" name="productCode" value=<%=pageDTO.getCode() %>>
			<ul><table>
					
				<tr><td><li>제품이름</li></td><td><input type = "text" name = "productName" value = <%=pageDTO.getPname() %>></td></tr>
				<tr><td><li>제품원가</li></td><td><input type = "text" name = "productPrice" value = <%=pageDTO.getCost() %>></td></tr>
				<tr><td><li>목표수량</li></td><td><input type = "text" name = "targetQuantity" value = <%=pageDTO.getPnum() %>></td></tr>
				<tr><td><li>재고수량</li></td><td><input type = "text" name = "availableStock" value = <%=pageDTO.getJnum() %>></td></tr>
				<tr><td><li>출고가</li></td><td><input type = "text" name = "shippingPrice" value = <%=pageDTO.getSale() %>></td></tr>
				<% str=pageDTO.getGcode(); %>
				<tr><td><li>그룹이름</li></td>
				<td><select name = "groupName">
					<option value = "A" <% if(str.equals("A")) {%> selected <%}%> >컴퓨터</option>
					<option value = "B" <% if(str.equals("B")) {%> selected <%}%> >냉장고</option>
					<option value = "C" <% if(str.equals("C")) {%> selected <%}%> >냉장소모품</option></select>
				</td></tr>
			</table></ul></form>

			<form name = "deleteform" action = "deleteform.edit" method = "post">
			<input type = "hidden" name = "productCode" value = <%=pageDTO.getCode() %>>
			</form>
<% } %>			
			<br><br>
			<a href="javascript:searchform.submit()"><input type = "button" value = "조회"></a>
			<a href="javascript:updateform.submit()"><input type = "button" value = "수정"></a>
			<a href="javascript:deleteform.submit()"><input type = "button" value = "삭제"></a>
			<input type = "button" value = "메인화면" onclick = "location.href='mainMenu.jsp'">
	</fieldset>

</body>
</html>