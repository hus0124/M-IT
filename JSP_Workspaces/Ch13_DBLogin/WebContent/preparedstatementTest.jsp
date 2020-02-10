<%@page import="java.sql.PreparedStatement"%>
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
int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");

String sql = "INSERT INTO student(num, name) VALUES (?,?)"; //prepared statement 숫자건 문자건 ?로 바꾸어줄 수 있다.
System.out.println(sql);
PreparedStatement pstmt = null;

try {
	Context init = new InitialContext();
	DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB");
	conn = ds.getConnection();
	//prepared Statement 쿼리문 입력하기
	pstmt = conn.prepareStatement(sql);
	
	pstmt.setInt(1, num);
	pstmt.setString(2, name);
	
	int result = pstmt.executeUpdate();
		
	if (result!=0){
		connect = true;
	}
		
}
catch(Exception e){
	e.printStackTrace();
}
finally {
	if(pstmt!=null) 
		try {pstmt.close();} catch(Exception e){e.printStackTrace();}
	if(conn!=null) 
		try {conn.close();} catch(Exception e){e.printStackTrace();}
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
<br><br>
<a href="resultSet.jsp">저장 결과 보기</a>
</body>
</html>