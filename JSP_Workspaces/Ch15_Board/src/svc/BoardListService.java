package svc;

import java.sql.Connection;
import java.util.ArrayList;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardListService {
	
	public ArrayList<BoardBean> getArticleList(){
		Connection conn = JdbcUtil.getConnection(); // DB ����
	
		BoardDAO boardDAO = BoardDAO.getInstance(); // �̱��� ��ü ����
		boardDAO.setConnection(conn);
		ArrayList<BoardBean> articleList = boardDAO.selectArticleList();
		JdbcUtil.close(conn);
		return articleList;
		
	}
	
}
