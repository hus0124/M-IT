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
<title>Insert title here</title>
</head>
<body>
<%

request.setCharacterEncoding("UTF-8");
//joinForm 에서 넘어온 값 읽기
String id = request.getParameter("id");
String password = request.getParameter("password");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String sql = "SELECT password FROM member WHERE id = ?";

try {
	Context init = new InitialContext();
	DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB"); 
	conn = ds.getConnection();
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);	// 입력된 id를 쿼리로 처리 
	
	rs = pstmt.executeQuery(); // 쿼리 실행 후 결과값 패스워드 받기
	
	if(rs.next()){
		// id가 있다
		if ( password.equals(rs.getString(1)) ){
			// 패스워드 동일 확인 
			session.setAttribute("id", id);	// 로그인 확인되므로 세션 만들어주기
			out.println("로그인 성공");
			String admin = (String)session.getAttribute("id");
			if(admin.equals("admin")){
				out.println("<a href=member_list.jsp>관리자 모드 접속(회원목록보기)</a>");
			}
		}
		else{
			out.println("패스워드 오류");
		}
	}
	else {
		// id가 없다
		out.println("해당하는 정보가 없습니다. 다시 한 번 확인해주세요");
	}
} catch(Exception e){
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
%>    
</body>
</html>