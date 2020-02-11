<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

Connection conn=null;
PreparedStatement pstmt=null;
ResultSet rs=null;

String sessionid = (String)session.getAttribute("id");
if((sessionid==null) || (!sessionid.equals("admin"))){
	out.println("접근이 제한된 페이지입니다.");
}
else {
	String info_id=request.getParameter("id");
	String sql = "SELECT * FROM member WHERE id=?";
		
	try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/mariaDB");
			conn = ds.getConnection();
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,info_id); 	// 쿼리 실행 후 결과값 받기
			rs=pstmt.executeQuery(); %>
			<table>
			<% while(rs.next()){ %>
				<tr>
					<td>아이디 : </td>
					<td><%=rs.getString("id") %></td>
				</tr>
				<tr>
					<td>비밀번호 : </td>
					<td><%=rs.getString("password") %></td>
				</tr>
				<tr>
					<td>이름 : </td>
					<td><%=rs.getString("name") %></td>
				</tr>
				<tr>
					<td>나이 : </td><td><%=rs.getString("age") %></td>
				</tr>
				<tr>
					<td>성별 : </td><td><%=rs.getString("gender") %></td>
				</tr>
				<tr>
					<td>이메일 주소 : </td>
					<td><%=rs.getString("email") %></td>
				</tr>
				<tr>
					<td colspan=2><a href="member_list.jsp">리스트로 돌아가기</a></td>
				</tr>
				
				<% } %> </table>
	<%}catch(Exception e){
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
}	
%>
<html>
<head>
<title>회원관리 시스템 관리자모드(회원 정보 보기)</title>
<style>
	table{
		margin : auto;
		width : 400px;
		border : 1px solid gray;
		text-align: center;
	}
</style>
</head>
<body>

</body>
</html>
