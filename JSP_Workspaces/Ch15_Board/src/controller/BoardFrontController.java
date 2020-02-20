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
@WebServlet("*.bo") // .bo�� ������ ������ �� �ްڴٴ� ��. �ϳ��� ��Ʈ�ѷ� �������� ����
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
		
    	String RequestURI = request.getRequestURI(); // URI �а�
    	System.out.println(RequestURI);
    	String contextPath = request.getContextPath(); // ���ؽ�Ʈ �н� 
    	System.out.println("contextpath:" + contextPath);
    	String command = RequestURI.substring(contextPath.length()); //URI �� ���ؽ�Ʈ �н� �����
    	System.out.println(command);
    	
    	ActionForward forward = null;
    	Action action = null;
    	
    	if(command.equals("/boardWriteForm.bo")) {	// �۾��� ȭ��
    		forward = new ActionForward();
    		forward.setPath("/board/qna_board_write.jsp"); //board ���� ���� �����Ƿ� ��� ���ֱ�
    		System.out.println("boardWriteForm �����̷�Ʈ");
    		
    	} 
    	else if(command.equals("/boardWritePro.bo")) { // �۾��� ��� �� �۸�� ���
    		//RequestDispatcher dispatcher = request.getRequestDispatcher("/board/qna_board_list.jsp");
    		//request.setAttribute("name", value);
    		//dispatcher.forward(request, response);
    		action = new BoardWriteProAction(); // �������̽� ������ Ŭ������ ��ü�� �����Ͽ� �ش� Ŭ������ �޼ҵ�, �ʵ忡 ����.
    		forward = action.execute(request, response); // forward�� BoardWriteProAction �� path�� redirect ���θ� ���Թ���
    		
    	}
    	else if(command.equals("/boardList.bo")) { // �۸�� ����
    		action = new BoardListAction();
    		forward = action.execute(request, response);  
    	}
    	
    	// ������ó��, �����̷�Ʈ �Ǵ� ������ �Ǻ�
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
