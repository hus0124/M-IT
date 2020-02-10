<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection conn = null;
String driver = "org.mariadb.jdbc.Driver";
String url = "jdbc:mariadb://localhost:3306/testDB";

Boolean connect = false;

try{
	Class.forName(driver);
	conn = DriverManager.getConnection(url, "java", "java");
	connect = true;
	conn.close();
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