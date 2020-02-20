package svc;

import java.sql.Connection;
import java.util.ArrayList;

import dao.BoardDAO;
import db.JdbcUtil;
import vo.BoardBean;

public class BoardListService {
	
	public ArrayList<BoardBean> getArticleList(){
		Connection conn = JdbcUtil.getConnection(); // DB 楷搬
	
		BoardDAO boardDAO = BoardDAO.getInstance(); // 教臂沛 按眉 积己
		boardDAO.setConnection(conn);
		ArrayList<BoardBean> articleList = boardDAO.selectArticleList();
		JdbcUtil.close(conn);
		return articleList;
		
	}
	
}
