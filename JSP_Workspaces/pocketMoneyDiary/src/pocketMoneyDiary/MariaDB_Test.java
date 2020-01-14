package pocketMoneyDiary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDB_Test {

	
	public static void main(String[] args) throws ClassNotFoundException{
		
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
			
			Statement stmt=conn.createStatement();
			//rs = stmt.executeQuery("show databases");
			rs = stmt.executeQuery("SELECT SUM(`in`) AS \"����\" FROM table_pocketmoneydiary");
			
			
			while(rs.next()){
				int inMoney = rs.getInt(1);
				System.out.println("�Ѽ��� : " + inMoney);
			}
			
			ResultSet rs1 = stmt.executeQuery("SELECT SUM(`OUT`) AS \"������\" FROM table_pocketmoneydiary");
			
			while(rs1.next()){
				int outMoney = rs1.getInt(1);
				System.out.println("������ : " + outMoney);
			}
			
			ResultSet rs2 = stmt.executeQuery("SELECT SUM(`in`)-SUM(`OUT`) AS \"������\" FROM table_pocketmoneydiary");
			
			while(rs2.next()){
				int Money = rs2.getInt(1);
				System.out.println("���� �ܾ� : " + Money);
			}
			
			ResultSet showTable = stmt.executeQuery("SELECT * FROM table_pocketmoneydiary ORDER BY NO DESC");
			
			while(showTable.next()) {
				String no = showTable.getString("no");
				String date = showTable.getString("date");
				String content = showTable.getString("content");
				String in = showTable.getString("in");
				String out = showTable.getString("out");
				System.out.println(no + date + content + in + out);
			}
		}catch(ClassNotFoundException cnfe){
			System.out.println("��� ����̹� �ε� ���� : " + cnfe.toString());
		}catch(SQLException se){
			System.out.println("��� ���� ����: " + se.toString());
		}catch(Exception e){
			System.out.println("���� ������ �𸣰ھ��");
			e.printStackTrace();
		}		

	}

}
