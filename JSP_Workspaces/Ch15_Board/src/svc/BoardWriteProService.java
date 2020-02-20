package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardWriteProService {
	
	public boolean registArticle(BoardBean boardbean){
		
		Connection conn = JdbcUtil.getConnection(); // DB ����
		
		BoardDAO boardDAO = BoardDAO.getInstance(); // �̱��� ��ü ����
		boardDAO.setConnection(conn); //�̱��� ��ü�� Ŀ�ؼ� ó��
		
		int insertCount = boardDAO.insertArticle(boardbean);
		boolean isWriteSucess = false;
		
		if (insertCount > 0) {
			JdbcUtil.commit(conn);
			isWriteSucess = true;
		}	
		else {
			JdbcUtil.rollback(conn);
		}
		
		JdbcUtil.close(conn);
		
		return isWriteSucess;
	}
}
