<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>생산관리 등록화면</title>
</head>
<body>
<h2>생산관리 등록화면</h2>
<form action ="createServlet" method = "post">
	<fieldset>
		<legend>생산관리 등록화면</legend>
			<ul><table>
				<tr><td><li>제품코드</li></td><td><input type = "text" name = "productCode" required = "required"></td></tr>
				<tr><td><li>제품이름</li></td><td><input type = "text" name = "productName" required = "required"></td></tr>
				<tr><td><li>제품원가</li></td><td><input type = "text" name = "productPrice"></td></tr>
				<tr><td><li>목표수량</li></td><td><input type = "text" name = "targetQuantity"></td></tr>
				<tr><td><li>재고수량</li></td><td><input type = "text" name = "availableStock"></td></tr>
				<tr><td><li>출고가</li></td><td><input type = "text" name = "shippingPrice"></td></tr>
				<tr><td><li>그룹이름</li></td>
				<td><select name = "groupName" required = "required">
					<option value = "A">컴퓨터</option>
					<option value = "B">냉장고</option>
					<option value = "C">냉장소모품</option></select>
				</td></tr>
			</table></ul>
			<br><br>
			<input type = "submit" name = "register" value = "등록">
			<input type = "button" value = "메인화면" onclick = "location.href='mainMenu.jsp'">
	</fieldset>
</form>
</body>
</html>