package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JdbcUtil;
import vo.BoardBean;

public class BoardDAO { // �Խ��� �����ؼ� DB ó���ϴ� Ŭ����
	
	Connection conn = null;
	
	//�̱��� ������ �̿�
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
		
	public int insertArticle(BoardBean boardbean) { //���α� �ۼ� ��� �޼ҵ�
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = 0;
		int insertCount = 0;
		
		// �� ��ȣ �˾ƿ��� �� �� ����ϱ�
		try {
			pstmt = conn.prepareStatement("SELECT MAX(board_num) FROM board");
			rs = pstmt.executeQuery();	//��������
			rs.next(); //Ŀ���̵�
			num = rs.getInt(1); //�� ��ȣ ���
			JdbcUtil.close(pstmt);
		
			pstmt = conn.prepareStatement("insert into board values(?,?,?,?,?,?,?,?,?,?,now())");
			pstmt.setInt(1, num+1);
			pstmt.setString(2, boardbean.getBoard_name());
			pstmt.setString(3, boardbean.getBoard_pass());
			pstmt.setString(4, boardbean.getBoard_subject());
			pstmt.setString(5, boardbean.getBoard_content());
			pstmt.setString(6, boardbean.getBoard_file());
			pstmt.setInt(7, 100); //re_ref
			pstmt.setInt(8, 0); // re_lev ���α��� ������ 0
			pstmt.setInt(9, 0); // re_step ���α��� ������ 0
			pstmt.setInt(10, 0); //��ȸ��
			
			insertCount = pstmt.executeUpdate();
			System.out.println("���α� DB ������Ʈ");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("BoardDAO ���� �߻�");
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
			rs = pstmt.executeQuery();	//��������
				
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
			System.out.println("�Խñ� ��� �ҷ����� ����");
		} finally {
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return articleList;
	}
}
