<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%

request.setCharacterEncoding("UTF-8");

String sessionid = (String)session.getAttribute("id");

if((sessionid==null) || (!sessionid.equals("admin"))){
	out.println("접근이 제한된 페이지입니다.");
}		

else {	
	String delete_id=request.getParameter("id");
	String sql = "DELETE FROM member WHERE id=?";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	try {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/mariaDB");
		conn = ds.getConnection();
			
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,delete_id);
			
		int result = pstmt.executeUpdate();
			
		if(result!=0){
			out.println("<script>");
			out.println("location.href='member_list.jsp'");
			out.println("</script>");
		}
		else {out.println("삭제 실패");}
	}catch(Exception e){
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
