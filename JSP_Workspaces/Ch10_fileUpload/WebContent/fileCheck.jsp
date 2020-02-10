<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.net.URLEncoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>

올린사람 : <%=request.getParameter("name") %><br>
제목 : <%=request.getParameter("subject") %><br>

<%
String fileName1 = request.getParameter("filename1");
fileName1 = URLEncoder.encode(fileName1, "UTF-8");
String fileName2 = request.getParameter("filename2");
fileName2 = URLEncoder.encode(fileName2, "UTF-8");
%>

파일명1 : <a href = "file_Down.jsp?file_name=<%=fileName1%>"><%=request.getParameter("ofile1") %></a><br>
파일명2 : <a href = "file_Down.jsp?file_name=<%=fileName2%>"><%=request.getParameter("ofile2") %></a><br>
</body>
</html>