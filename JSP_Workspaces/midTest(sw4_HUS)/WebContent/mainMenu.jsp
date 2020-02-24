<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>생산관리 시스템</title>

</head>
<body>
<h2>생산관리 시스템</h2>
<!--  form action = "mainMenuServlet" method = "get"> -->
	<fieldset>
		<legend>생산관리 메인메뉴</legend>
			<table>
				<tr><td><input type = "button" value = "제품입력" onclick = "location.href='registration.jsp'"></td>
					<td><input type = "button" value = "제품조회" onclick = "location.href='lookupEdit.jsp'"></td>
					<td><form action = "prioritylist.main" method = "post"><input type = "submit" name = "prioritylist" value = "우선생산제품"></form></td>
					<td><form action = "profitrank.main" method = "post"><input type = "submit" name = "profitrank" value = "이익순위"></form></td>
				</tr>
				<tr><td><form action = "groupstock.main" method = "post"><input type = "submit" name = "groupstock" value = "그룹별재고수량"></form></td>
				</tr>	
			</table>
	</fieldset>
<!--  </form> -->
</body>
</html>