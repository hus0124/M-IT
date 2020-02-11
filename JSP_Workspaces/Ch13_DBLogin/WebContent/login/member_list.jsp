<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원관리 시스템 관리자모드(회원목록보기)</title>
<style>
	table{
		margin : auto;
		width : 400px;
		border : 1px solid gray;
		text-align: center;
	}
	.td_title{
		font-weight: bold;
		font-size: x-large;
	}
</style>
</head>
<body>

<%

request.setCharacterEncoding("UTF-8");
//joinForm 에서 넘어온 값 읽기

String sessionid = (String)session.getAttribute("id");
if((sessionid==null) || (!sessionid.equals("admin"))){
	out.println("접근이 제한된 페이지입니다.");
}
else{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "SELECT id FROM member";
	
	try {
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB"); 
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement(sql); // id 컬럼만 싹 다 받아오므로 pstmt.setString 할 필요 없다.
				
		rs = pstmt.executeQuery(); %> 
				
		<table>
		<tr><td colspan=2 class="td_title">회원 목록</td></tr>
		<% while(rs.next()){ %>
		
		<tr><td><a href="member_info.jsp?id=<%=rs.getString(1)%>"><%=rs.getString(1)%></a></td>
		<td><a href="member_delete.jsp?id=<%=rs.getString(1)%>">삭제</a></td>
		</tr>
	
	<% } %> </table>
		<% } catch(Exception e){
		e.printStackTrace();
	}
	finally {
		if(rs!=null) 
			try {rs.close();} catch(Exception e){e.printStackTrace();}
		if(pstmt!=null) 
			try {pstmt.close();} catch(Exception e){e.printStackTrace();}
		if(conn!=null) 
			try {conn.close();} catch(Exception e){e.printStackTrace();}
	}
}//else
%>


</body>
</html>