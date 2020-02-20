package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {	// DB 연결, 종료, resultset, 커밋 모두 메소드로 지정해주는 클래스
	
	public static Connection getConnection() {	//객체 생성 없이 바로 쓰게 static 메소드 설정
		
		Connection conn = null;
		
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB");
			conn = ds.getConnection();
			conn.setAutoCommit(false); // 수동 트랜잭션 처리 위해 오토 커밋은 false로 지정.
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("커넥션 접속에러");
		}
		
		return conn;
		
	}
	
	public static void close(Connection conn) { // DB 커넥션 종료
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("커넥션 종료 에러");
			}
		}
	}
	
	public static void close(Statement stmt) { // prepared 의 상위인 statement 로 인자 지정해도 된다.
		if(stmt!=null) {
			try {
				stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("statement 종료 에러");
			}
		}
	}
	
	public static void close(ResultSet rs) { // ResultSet 종료
		if(rs!=null) {
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("resultset 종료에러");
			}
		}
	}
	
	public static void commit(Connection conn) { // 커미트
		
			try {
				conn.commit();
				System.out.println("commit success");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public static void rollback(Connection conn) { //롤백
		
			try {
				conn.rollback();
				System.out.println("rollback success");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("rollback 에러");
			}
		
	}
}
