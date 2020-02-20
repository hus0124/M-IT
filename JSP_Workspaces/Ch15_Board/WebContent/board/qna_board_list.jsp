<%@page import="vo.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<BoardBean> articleList = (ArrayList<BoardBean>)request.getAttribute("articleList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#registForm {
	width: 500px;
	height: 600px;
	border: 1px solid red;
	margin: auto;
}

h2 {
	text-align: center;
}

table {
	margin: auto;
	width: 450px;
}

#tr_top {
	background: orange;
	text-align: center;
}

#pageList {
	margin: auto;
	width: 500px;
	text-align: center;
}

#emptyArea {
	margin: auto;
	width: 500px;
	text-align: center;
}
</style>
</head>
<body>
<section id="listForm">
<h2>여기는 글 목록 화면입니다.<a href = "/boardWriteForm.bo">게시판 글쓰기</a></h2>
<table>
	<tr id="tr_top">
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
<%
	for(int i = 0; i <articleList.size(); i++){ %>
		<tr><td><%= articleList.get(i).getBoard_num() %></td>
		<td><%= articleList.get(i).getBoard_subject() %></td>
		<td><%= articleList.get(i).getBoard_name() %></td>
		<td><%= articleList.get(i).getBoard_date() %></td>
		<td><%= articleList.get(i).getBoard_readcount() %></td>
		</tr>
<% } %>
</body>
</html>