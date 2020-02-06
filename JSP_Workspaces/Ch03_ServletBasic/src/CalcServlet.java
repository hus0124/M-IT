

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String anum = request.getParameter("num1");
		String bnum = request.getParameter("num2");
		response.setContentType("text/html; charset=EUC-KR");
		
		int anum1 = Integer.parseInt(anum);
		int bnum1 = Integer.parseInt(bnum);
		int result = anum1 + bnum1;
		
		PrintWriter out = response.getWriter();
		out.println(anum+" 와(과) "+bnum+"의 합은 "+result+"입니다");
		
	}

}
