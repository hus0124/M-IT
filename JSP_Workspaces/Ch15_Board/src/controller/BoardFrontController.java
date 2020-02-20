package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import vo.*;

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.bo") // .bo로 끝나는 파일을 다 받겠다는 뜻. 하나의 컨트롤러 서블렛으로 통합
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }
      
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
    	String RequestURI = request.getRequestURI(); // URI 읽고
    	System.out.println(RequestURI);
    	String contextPath = request.getContextPath(); // 컨텍스트 패스 
    	System.out.println("contextpath:" + contextPath);
    	String command = RequestURI.substring(contextPath.length()); //URI 중 컨텍스트 패스 지우기
    	System.out.println(command);
    	
    	ActionForward forward = null;
    	Action action = null;
    	
    	if(command.equals("/boardWriteForm.bo")) {	// 글쓰기 화면
    		forward = new ActionForward();
    		forward.setPath("/board/qna_board_write.jsp"); //board 폴더 내에 있으므로 경로 써주기
    		System.out.println("boardWriteForm 리다이렉트");
    		
    	} 
    	else if(command.equals("/boardWritePro.bo")) { // 글쓰기 등록 및 글목록 출력
    		//RequestDispatcher dispatcher = request.getRequestDispatcher("/board/qna_board_list.jsp");
    		//request.setAttribute("name", value);
    		//dispatcher.forward(request, response);
    		action = new BoardWriteProAction(); // 인터페이스 구현한 클래스의 객체로 대입하여 해당 클래스의 메소드, 필드에 접근.
    		forward = action.execute(request, response); // forward는 BoardWriteProAction 의 path와 redirect 여부를 대입받음
    		
    	}
    	else if(command.equals("/boardList.bo")) { // 글목록 보기
    		action = new BoardListAction();
    		forward = action.execute(request, response);  
    	}
    	
    	// 포워딩처리, 리다이렉트 또는 디스패쳐 판별
    	if(forward != null) {
	    	if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
    	}	
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
