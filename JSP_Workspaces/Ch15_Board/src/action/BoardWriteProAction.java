package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import svc.BoardWriteProService;
import vo.ActionForward;
import vo.BoardBean;

public class BoardWriteProAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 글을 등록한다.
		BoardBean boardbean = new BoardBean(); // DB 저장 위한 객체
		
		MultipartRequest multi = null;
		int size = 1024 * 1024 * 10; // kb단위이므로 size 10MB
		String uploadPath = request.getRealPath("/upload");
		
		multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
		boardbean.setBoard_name(multi.getParameter("board_name"));
		boardbean.setBoard_pass(multi.getParameter("board_name"));
		boardbean.setBoard_subject(multi.getParameter("board_subject"));
		boardbean.setBoard_content(multi.getParameter("board_content"));
		boardbean.setBoard_file(multi.getOriginalFileName((String)multi.getFileNames().nextElement()));
		
		System.out.println(boardbean.toString()); //toString을 BoardBean에서 만들어줘야 함.
		
		BoardWriteProService boardWriteProService = new BoardWriteProService();
		boardWriteProService.registArticle(boardbean);
		
		// 등록하면 그 다음엔 글 리스트가 보여야 한다. 글 리스트 페이지로 리다이렉트
		// 어디로 가고, 방식이 무엇인지 설정. 
		ActionForward forward = new ActionForward();
		forward.setPath("/boardList.bo");
		
		forward.setRedirect(true); // 리다이렉트
		return forward;
	}

}
