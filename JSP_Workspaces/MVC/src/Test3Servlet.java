

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test3Servlet
 */
@WebServlet("/Test3")
public class Test3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*Test3Quiz tq3 = new Test3Quiz();
		int sum = tq3.calc(request);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Test3.jsp");
		System.out.println(sum);
		request.setAttribute("sum", sum);
		dispatcher.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		Test3Quiz tq3 = new Test3Quiz();
		int sum = tq3.calc(num1, num2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Test3.jsp"); // url이 바뀌지 않는 디스패쳐 방식
		System.out.println(sum);
		request.setAttribute("sum", sum);
		dispatcher.forward(request, response);
		
	}

}
