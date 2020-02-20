package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.BoardListService;
import vo.ActionForward;
import vo.BoardBean;

public class BoardListAction implements Action {

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// boardlist.bo : DB�� �����Ͽ� ������ �� ����� �����;� �Ѵ�.
		BoardListService boardListService = new BoardListService();
		ArrayList<BoardBean> articleList = boardListService.getArticleList();
				
		ActionForward forward = new ActionForward();
		forward.setPath("/board/qna_board_list.jsp"); //board ���� ���� �����Ƿ� ��� ���ֱ�
		
		//DB���� ������ �� ��� articleList �����ؼ� ������
		request.setAttribute("articleList", articleList);
		forward.setRedirect(false); // DB ������ �Ǿ�� �ϹǷ� ������ ���.
		System.out.println("�� ��� �������� ���� ���� ȣ��");
		return forward;
	}

}
