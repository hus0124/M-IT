<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
h3{text-align:center;}
table{margin:auto; width:450px;}
.td_left{width:150px;background:orange;}
.td_right{width:300px;background:skyblue;}
#commandCell{text-align:center;}
</style>
</head>
<body>
<h3>게시판 글 등록</h3>
<form action = "/boardWritePro.bo" method = "post" enctype = "multipart/form-data">
<table>
	<tr>
		<td class = "td_left">글쓴이:</td>
		<td class = "td_right"><input type="text" name="board_name" required = "required"></td>
	</tr>
	<tr>	
		<td class = "td_left">비밀번호:</td>
		<td class = "td_right"><input type="password" name="board_pass" required = "required"></td>
	</tr>
	<tr>
		<td class = "td_left">제목:</td>
		<td class = "td_right"><input type="text" name="board_subject" required = "required"></td>
	</tr>
	<tr>	
		<td class = "td_left">내용:</td>
		<td class = "td_right"><textarea name = "board_content" cols="40" rows="15" required = "required"></textarea></td>
	</tr>
	<tr>
		<td class = "td_left">파일첨부:</td>
		<td class = "td_right"><input type="file" name="board_file"></td>
	</tr>
</table>
<section id = "commandCell">	
<input type = "submit" value = "등록">&emsp;
<input type = "reset" value = "다시쓰기">
</section>
</form>
</body>
</html>