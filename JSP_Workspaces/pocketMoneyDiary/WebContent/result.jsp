<%@ page import="java.sql.Connection"
import="java.sql.DriverManager"
import="java.sql.ResultSet"
import="java.sql.SQLException"
import="java.sql.Statement"  %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
tr,td, th {border : 1px solid}
</style>
</head>
<body>
<h3>&emsp;&emsp;&emsp;&emsp;&emsp;�� �� ��</h3>
	
		
	<% String ID = "admin";
	   String PW = "1234";
	   
	   String userID = request.getParameter("id");
	   String userPW = request.getParameter("pw");
	   
	    int inMoney=0;
		int outMoney=0;
		int Money=0;
		
		String no=null;
		String date=null;
		String content=null;
		String in=null;
		String outM=null;
				
	   if(userID.equals(ID) && userPW.equals(PW)){%> 
		   
		   <table style="border:1px solid; border-collapse:collapse">
		     <tr><th>����</th><th>����</th><th>����</th><th>����</th><th>����</th></tr>
		     
		   <% try{
				Class.forName("org.mariadb.jdbc.Driver");
				Connection conn=null;
				ResultSet rs = null;
				
				conn = DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/javadb",
						/* ���߿� �� ���� "jdbc:mariadb://localhost:3306/DB��" �� �Է��Ѵ�. */
						"java",
						"java");
				
				System.out.println("�����ͺ��̽��� ���������� �����.\n");
				
				Statement stmt=conn.createStatement();
				//rs = stmt.executeQuery("show databases");
				rs = stmt.executeQuery("SELECT SUM(`in`) AS \"����\" FROM table_pocketmoneydiary");
				
				
				while(rs.next()){
					inMoney = rs.getInt(1);
					System.out.println("�Ѽ��� : " + inMoney);
				}
				
				ResultSet rs1 = stmt.executeQuery("SELECT SUM(`OUT`) AS \"������\" FROM table_pocketmoneydiary");
				
				while(rs1.next()){
					outMoney = rs1.getInt(1);
					System.out.println("������ : " + outMoney);
				}
				
				ResultSet rs2 = stmt.executeQuery("SELECT SUM(`in`)-SUM(`OUT`) AS \"������\" FROM table_pocketmoneydiary");
				
				while(rs2.next()){
					Money = rs2.getInt(1);
					System.out.println("���� �ܾ� : " + Money);
				}
								
				ResultSet showTable = stmt.executeQuery("SELECT * FROM table_pocketmoneydiary ORDER BY NO DESC");
				
				while(showTable.next()) {
					no = showTable.getString("no");
					date = showTable.getString("date");
					content = showTable.getString("content");
					in = showTable.getString("in");
					outM = showTable.getString("out");
					System.out.println(no + date + content + in + outM); %>
				
					<tr>
						<td><%=no%></td>
						<td><%=date%></td>
						<td><%=content%></td>
						<td><%=in%></td>
						<td><%=outM%></td>
					</tr>
					
				<% }
				
				showTable = stmt.executeQuery("SELECT * FROM table_pocketmoneydiary WHERE `OUT` = (SELECT MAX(`out`) FROM table_pocketmoneydiary)");
				
				while(showTable.next()){
					no = showTable.getString("no");
					date = showTable.getString("date");
					content = showTable.getString("content");
					//in = rs3.getString("in");
					outM = showTable.getString("out");
					System.out.printf("%s, %s, %s, %s", no,date,content,outM);
				}
				
			}catch(ClassNotFoundException cnfe){
				System.out.println("��� ����̹� �ε� ���� : " + cnfe.toString());
			}catch(SQLException se){
				System.out.println("��� ���� ����: " + se.toString());
			}catch(Exception e){
				System.out.println("���� ������ �𸣰ھ��");
				e.printStackTrace();
			}   
	%>
	</table><br>		
	�Ѽ��� : <%=inMoney %><br>
	������ : <%=outMoney %><br>
	�����ܾ� : <%=Money %><br>
	�ִ������̷� : <%=no%>&nbsp;<%=date%>&nbsp;<%=content%>&nbsp;<%=outM%><br><br>
	
	<a href = "input.jsp"><button>�Է�</button></a>
	
	<a href = "delete.jsp"><button>����</button></a>
	
	<%} else{
	%>
	<fieldset style="width:30%; font-size:30px; text-align:center">
	�α��� ������ Ȯ���� �ּ���<br><br>
	<a href = "index.html"><button style="width:180px;height:50px;font-size:20px;">�ٽ� �α��� �ϱ�</button>
	</a></fieldset>
	<%} %>
</body>
</html>