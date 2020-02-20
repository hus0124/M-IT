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
		
		// boardlist.bo : DB에 접속하여 보여줄 글 목록을 가져와야 한다.
		BoardListService boardListService = new BoardListService();
		ArrayList<BoardBean> articleList = boardListService.getArticleList();
				
		ActionForward forward = new ActionForward();
		forward.setPath("/board/qna_board_list.jsp"); //board 폴더 내에 있으므로 경로 써주기
		
		//DB에서 가져온 글 목록 articleList 포함해서 보내기
		request.setAttribute("articleList", articleList);
		forward.setRedirect(false); // DB 정보를 실어야 하므로 디스패쳐 방식.
		System.out.println("글 목록 가져오기 위한 서비스 호출");
		return forward;
	}

}
