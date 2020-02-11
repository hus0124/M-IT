<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	//joinForm 에서 넘어온 값 읽기
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Boolean connect = false;
	String forword = "'joinForm.jsp'";	// id 중복으로 입력실패 시 돌아갈 기본값 설정
	
	String sql = "INSERT INTO member VALUES(?,?,?,?,?,?)";
	
	try {
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB"); //context.xml 통한 커넥션 풀에 db 접속 기능 있음.
		conn = ds.getConnection();
		//prepared Statement 쿼리문 입력하기
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, id);	//id가 pk 이므로 중복되면 입력이 안 들어간다.
		pstmt.setString(2, password);
		pstmt.setString(3, name);
		pstmt.setInt(4, age);
		pstmt.setString(5, gender);
		pstmt.setString(6, email);
				
		int result = pstmt.executeUpdate(); // 쿼리 실행
				
		if (result!=0){
			connect = true;	//db 입력 성공. loginForm으로 넘어감
			forword = "'loginForm.jsp'";
			
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
	out.println("<script>");
	out.println("location.href="+forword);
	out.println("</script>");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if (connect == true){
	System.out.println("연결성공");}
else {
	System.out.println("연결실패");
} %>
</body>
</html>