package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JdbcUtil;
import vo.BoardBean;

public class BoardDAO { // 게시판 관련해서 DB 처리하는 클래스
	
	Connection conn = null;
	
	//싱글톤 생성자 이용
	private BoardDAO() {}
	
	private static BoardDAO boardDAO;
	
	public void setConnection(Connection conn) {
		this.conn = conn;
	}
		
	public static BoardDAO getInstance() {
		if(boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
//	public BoardDAO(Connection conn){
//		this.conn = conn;
//	}
		
	public int insertArticle(BoardBean boardbean) { //메인글 작성 등록 메소드
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = 0;
		int insertCount = 0;
		
		// 글 번호 알아오기 및 글 등록하기
		try {
			pstmt = conn.prepareStatement("SELECT MAX(board_num) FROM board");
			rs = pstmt.executeQuery();	//쿼리실행
			rs.next(); //커서이동
			num = rs.getInt(1); //글 번호 얻기
			JdbcUtil.close(pstmt);
		
			pstmt = conn.prepareStatement("insert into board values(?,?,?,?,?,?,?,?,?,?,now())");
			pstmt.setInt(1, num+1);
			pstmt.setString(2, boardbean.getBoard_name());
			pstmt.setString(3, boardbean.getBoard_pass());
			pstmt.setString(4, boardbean.getBoard_subject());
			pstmt.setString(5, boardbean.getBoard_content());
			pstmt.setString(6, boardbean.getBoard_file());
			pstmt.setInt(7, 100); //re_ref
			pstmt.setInt(8, 0); // re_lev 메인글은 무조건 0
			pstmt.setInt(9, 0); // re_step 메인글은 무조건 0
			pstmt.setInt(10, 0); //조회수
			
			insertCount = pstmt.executeUpdate();
			System.out.println("메인글 DB 업데이트");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("BoardDAO 예외 발생");
		} finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		
		return insertCount; 
	}
	
	public ArrayList<BoardBean> selectArticleList() {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardBean> articleList = new ArrayList<BoardBean>();
		BoardBean boardbean = null;
		
		try {
			pstmt = conn.prepareStatement("SELECT * FROM board ORDER BY re_ref DESC, re_step");
			rs = pstmt.executeQuery();	//쿼리실행
				
			while(rs.next()) {
				boardbean = new BoardBean();
				boardbean.setBoard_num(rs.getInt(1));
				boardbean.setBoard_name(rs.getString(2));
				boardbean.setBoard_pass(rs.getString(3));
				boardbean.setBoard_subject(rs.getString(4));
				boardbean.setBoard_content(rs.getString(5));
				boardbean.setBoard_file(rs.getString(6));
				boardbean.setRe_ref(rs.getInt(7));
				boardbean.setRe_lev(rs.getInt(8));
				boardbean.setRe_step(rs.getInt(9));
				boardbean.setBoard_readcount(rs.getInt(10));
				boardbean.setBoard_date(rs.getDate(11));
				articleList.add(boardbean);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("게시글 목록 불러오기 에러");
		} finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return articleList;
	}
}
