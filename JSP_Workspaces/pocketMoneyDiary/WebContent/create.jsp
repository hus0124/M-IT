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
			/* ���߿� �� ���� "jdbc:mariadb://localhost:3306/DB��" �� �Է��Ѵ�. */
			"java",
			"java");
	
	System.out.println("�����ͺ��̽��� ���������� �����.\n");
	
	PreparedStatement pstmt=conn.prepareStatement("INSERT INTO table_pocketmoneydiary (`date`, `content`, `out`) VALUES (?,?,?)");
	//rs = stmt.executeQuery("show databases");
	PreparedStatement pstmt1=conn.prepareStatement("INSERT INTO table_pocketmoneydiary (`date`, `content`, `in`) VALUES (?,?,?)");
	
	String date = request.getParameter("date");	//�Է³�¥
	String content = request.getParameter("content"); //����
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
		System.out.println("��� ����̹� �ε� ���� : " + cnfe.toString());
	}catch(SQLException se){
		System.out.println("��� ���� ����: " + se.toString());
	}catch(Exception e){
		System.out.println("���� ������ �𸣰ھ��");
		e.printStackTrace();
	} 

%>
<form action="result.jsp" method="post">
�Է¿Ϸ�<br>
<a href = "result.jsp"><button style="width:150px;height:50px;font-size:15px;">�������� ���ư���</button>
</a>
<input type = "hidden" value="admin" name = "id">
<input type = "hidden" value="1234" name = "pw">
</form>
</body>
</html>