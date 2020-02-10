<%@page import="java.sql.ResultSet"%>
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

String sql = "SELECT * FROM student ORDER BY num DESC"; //prepared statement 숫자건 문자건 ?로 바꾸어줄 수 있다.
System.out.println(sql);
PreparedStatement pstmt = null;
ResultSet rs = null;

try {
	//커넥션 pool 작업
	Context init = new InitialContext();
	DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB");
	conn = ds.getConnection();
	
	//prepared Statement 쿼리문 입력하기
	pstmt = conn.prepareStatement(sql);
	
	rs = pstmt.executeQuery();
	
	while(rs.next()){
		out.print(rs.getInt(1)+":"+rs.getString(2));
		out.print("<br>");
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
	if(rs!=null) 
		try {rs.close();} catch(Exception e){e.printStackTrace();}
}%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
%>
</body>
</html>