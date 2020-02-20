package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardWriteProService {
	
	public boolean registArticle(BoardBean boardbean){
		
		Connection conn = JdbcUtil.getConnection(); // DB 楷搬
		
		BoardDAO boardDAO = BoardDAO.getInstance(); // 教臂沛 按眉 积己
		boardDAO.setConnection(conn); //教臂沛 按眉俊 目池记 贸府
		
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
