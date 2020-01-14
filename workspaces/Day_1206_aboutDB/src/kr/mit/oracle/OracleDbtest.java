package kr.mit.oracle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDbtest extends DBConnection {
	
	//라이브러리 파일 위치는 C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			System.out.println("1");
			conn = DBConnection.getConnection();			
			// 2. 상태 정보
			System.out.println("2");
			String query="SELECT * FROM EMP";
			pstmt=conn.prepareStatement(query);
			System.out.println("3");
			// 3. 쿼리 실행
			rs=pstmt.executeQuery();		// 3까지는 DB 시스템에 있는 것을 불러와서 자바 객체에 넣어주는 과정. 
			// 4. 쿼리 결과 처리
			System.out.println("4");
			System.out.println("직원번호 | 직원이름 | 직무 | 관리자 | 입사일 | 봉급 | 수당 | 부서번호");
			System.out.println("======================================================");
			while(rs.next()){
				// 1. 컬럼 명으로 사용하는 경우
				// int empno = rs.getInt("empno");
				
				//2. 번호로 사용
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
			System.out.println("쿼리문에서 예외 발생했습니다.");
			se.printStackTrace();
		}finally{
			// 5. 연결 상태 닫음
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
