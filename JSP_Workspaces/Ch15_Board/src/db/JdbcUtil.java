package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcUtil {	// DB ����, ����, resultset, Ŀ�� ��� �޼ҵ�� �������ִ� Ŭ����
	
	public static Connection getConnection() {	//��ü ���� ���� �ٷ� ���� static �޼ҵ� ����
		
		Connection conn = null;
		
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mariaDB");
			conn = ds.getConnection();
			conn.setAutoCommit(false); // ���� Ʈ����� ó�� ���� ���� Ŀ���� false�� ����.
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ŀ�ؼ� ���ӿ���");
		}
		
		return conn;
		
	}
	
	public static void close(Connection conn) { // DB Ŀ�ؼ� ����
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Ŀ�ؼ� ���� ����");
			}
		}
	}
	
	public static void close(Statement stmt) { // prepared �� ������ statement �� ���� �����ص� �ȴ�.
		if(stmt!=null) {
			try {
				stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("statement ���� ����");
			}
		}
	}
	
	public static void close(ResultSet rs) { // ResultSet ����
		if(rs!=null) {
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("resultset ���ῡ��");
			}
		}
	}
	
	public static void commit(Connection conn) { // Ŀ��Ʈ
		
			try {
				conn.commit();
				System.out.println("commit success");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public static void rollback(Connection conn) { //�ѹ�
		
			try {
				conn.rollback();
				System.out.println("rollback success");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("rollback ����");
			}
		
	}
}
