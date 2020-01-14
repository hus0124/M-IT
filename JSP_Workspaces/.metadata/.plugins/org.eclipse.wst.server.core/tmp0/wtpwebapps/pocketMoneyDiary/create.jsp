<%@ page import="java.sql.Connection"
import="java.sql.DriverManager"
import="java.sql.ResultSet"
import="java.sql.SQLException"
import="java.sql.Statement"  
import="java.sql.PreparedStatement"
%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

try{
	Class.forName("org.mariadb.jdbc.Driver");
	Connection conn=null;
	ResultSet rs = null;
	
	
	conn = DriverManager.getConnection(
			"jdbc:mariadb://localhost:3306/javadb",
			/* 나중에 쓸 때는 "jdbc:mariadb://localhost:3306/DB명" 을 입력한다. */
			"java",
			"java");
	
	System.out.println("데이터베이스에 정상적으로 연결됨.\n");
	
	PreparedStatement pstmt=conn.prepareStatement("INSERT INTO table_pocketmoneydiary (`date`, `content`, `out`) VALUES (?,?,?)");
	//rs = stmt.executeQuery("show databases");
	PreparedStatement pstmt1=conn.prepareStatement("INSERT INTO table_pocketmoneydiary (`date`, `content`, `in`) VALUES (?,?,?)");
	
	String date = request.getParameter("date");	//입력날짜
	String content = request.getParameter("content"); //내용
	String money = request.getParameter("money");
	String select = request.getParameter("select");
	
	if(select.equals("out")){
		pstmt.setString(1,date);
		pstmt.setString(2,content);
		pstmt.setString(3,money);
		rs = pstmt.executeQuery();
	}
	else{
		pstmt.setString(1,date);
		pstmt.setString(2,content);
		pstmt.setString(3,money);
		rs = pstmt1.executeQuery();
	}
	
}
	catch(ClassNotFoundException cnfe){
		System.out.println("디비 드라이버 로딩 실패 : " + cnfe.toString());
	}catch(SQLException se){
		System.out.println("디비 접속 실패: " + se.toString());
	}catch(Exception e){
		System.out.println("에러 이유를 모르겠어오");
		e.printStackTrace();
	} 

%>
<form action="result.jsp" method="post">
입력완료<br>
<a href = "result.jsp"><button style="width:150px;height:50px;font-size:15px;">메인으로 돌아가기</button>
</a>
<input type = "hidden" value="admin" name = "id">
<input type = "hidden" value="1234" name = "pw">
</form>
</body>
</html>