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
		// ���� ����Ѵ�.
		BoardBean boardbean = new BoardBean(); // DB ���� ���� ��ü
		
		MultipartRequest multi = null;
		int size = 1024 * 1024 * 10; // kb�����̹Ƿ� size 10MB
		String uploadPath = request.getRealPath("/upload");
		
		multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
		boardbean.setBoard_name(multi.getParameter("board_name"));
		boardbean.setBoard_pass(multi.getParameter("board_name"));
		boardbean.setBoard_subject(multi.getParameter("board_subject"));
		boardbean.setBoard_content(multi.getParameter("board_content"));
		boardbean.setBoard_file(multi.getOriginalFileName((String)multi.getFileNames().nextElement()));
		
		System.out.println(boardbean.toString()); //toString�� BoardBean���� �������� ��.
		
		BoardWriteProService boardWriteProService = new BoardWriteProService();
		boardWriteProService.registArticle(boardbean);
		
		// ����ϸ� �� ������ �� ����Ʈ�� ������ �Ѵ�. �� ����Ʈ �������� �����̷�Ʈ
		// ���� ����, ����� �������� ����. 
		ActionForward forward = new ActionForward();
		forward.setPath("/boardList.bo");
		
		forward.setRedirect(true); // �����̷�Ʈ
		return forward;
	}

}
