package kr.mit.oracle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDbtest extends DBConnection {
	
	//���̺귯�� ���� ��ġ�� C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			System.out.println("1");
			conn = DBConnection.getConnection();			
			// 2. ���� ����
			System.out.println("2");
			String query="SELECT * FROM EMP";
			pstmt=conn.prepareStatement(query);
			System.out.println("3");
			// 3. ���� ����
			rs=pstmt.executeQuery();		// 3������ DB �ý��ۿ� �ִ� ���� �ҷ��ͼ� �ڹ� ��ü�� �־��ִ� ����. 
			// 4. ���� ��� ó��
			System.out.println("4");
			System.out.println("������ȣ | �����̸� | ���� | ������ | �Ի��� | ���� | ���� | �μ���ȣ");
			System.out.println("======================================================");
			while(rs.next()){
				// 1. �÷� ������ ����ϴ� ���
				// int empno = rs.getInt("empno");
				
				//2. ��ȣ�� ���
				int empno = rs.getInt(1);
				String ename=rs.getString(2);
				String job=rs.getString(3);
				int mgr=rs.getInt(4);
				Date hiredate=rs.getDate(5);
				int sal=rs.getInt(6);
				int comm=rs.getInt(7);
				int deptno=rs.getInt(8);
				
				String result = empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno;
				System.out.println(result);
			}
		}
		catch(SQLException se){
			System.out.println("���������� ���� �߻��߽��ϴ�.");
			se.printStackTrace();
		}finally{
			// 5. ���� ���� ����
			try{
				if(rs != null){
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}
			catch(Exception e){
				throw new RuntimeException(e.getMessage());
			}
			
		}
		
		
			
	
		
	}
	
}
