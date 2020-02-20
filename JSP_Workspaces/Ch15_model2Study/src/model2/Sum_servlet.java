package model2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum_servlet
 */
@WebServlet("/sum")
public class Sum_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 모델에서 처리
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		Add add = new Add(); //모델 비즈니스 로직에서 생성한 객체
		int sum = add.sum(num1, num2);
		
		//Dispatcher 방식 p143
		RequestDispatcher dispatcher = request.getRequestDispatcher("sum.jsp");
		request.setAttribute("sum", sum);
		dispatcher.forward(request, response);
	}

}
