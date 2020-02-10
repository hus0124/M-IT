<%@page import="java.sql.Statement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

Connection conn = null;
Boolean connect = false;
String num = request.getParameter("num");
String name = request.getParameter("name");

String sql = "INSERT INTO student(num, name) VALUES (" + num + ", '" + name + "');";
System.out.println(sql);

try {
	Context init = new InitialContext();
	DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB");
	conn  = ds.getConnection();
	//쿼리문 입력하기
	
	Statement stmt = conn.createStatement();
	int result = stmt.executeUpdate(sql);
	
	if (result!=0){
		connect = true;
	}
	stmt.close();
	conn.close();
	connect = true;
}
catch(Exception e){
	e.printStackTrace();
}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if (connect==true){ %>
	연결성공 
<% }else{ %>
	연결실패 
<% } %>
</body>
</html>