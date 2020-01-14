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
					/* 나중에 쓸 때는 "jdbc:mariadb://localhost:3306/DB명" 을 입력한다. */
					"java",
					"java");
			
			System.out.println("데이터베이스에 정상적으로 연결됨.\n");
			
			Statement stmt=conn.createStatement();
			//rs = stmt.executeQuery("show databases");
			rs = stmt.executeQuery("SELECT SUM(`in`) AS \"총합\" FROM table_pocketmoneydiary");
			
			
			while(rs.next()){
				int inMoney = rs.getInt(1);
				System.out.println("총수입 : " + inMoney);
			}
			
			ResultSet rs1 = stmt.executeQuery("SELECT SUM(`OUT`) AS \"총지출\" FROM table_pocketmoneydiary");
			
			while(rs1.next()){
				int outMoney = rs1.getInt(1);
				System.out.println("총지출 : " + outMoney);
			}
			
			ResultSet rs2 = stmt.executeQuery("SELECT SUM(`in`)-SUM(`OUT`) AS \"총지출\" FROM table_pocketmoneydiary");
			
			while(rs2.next()){
				int Money = rs2.getInt(1);
				System.out.println("현재 잔액 : " + Money);
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
			System.out.println("디비 드라이버 로딩 실패 : " + cnfe.toString());
		}catch(SQLException se){
			System.out.println("디비 접속 실패: " + se.toString());
		}catch(Exception e){
			System.out.println("에러 이유를 모르겠어오");
			e.printStackTrace();
		}		

	}

}
