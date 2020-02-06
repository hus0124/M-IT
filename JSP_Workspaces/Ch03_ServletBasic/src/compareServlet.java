

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/compare")

public class compareServlet extends HttpServlet implements Comparable<Object> {
	private static final long serialVersionUID = 1L;
     	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public compareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=EUC-KR");
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i=1;i<=10;i++) {
		
			list1.add(Integer.parseInt(request.getParameter("num"+i)));
			
		}
		
		list1.stream()
			.forEach(System.out::println);
		
		list1.stream()
			.sorted((a,b) -> a.compareTo(b))
			.forEach(System.out::println);
			
		int minnum = list1.get(0);
		int maxnum = list1.get(9);
						
		PrintWriter out = response.getWriter();
		out.println("최소 값은 "+minnum+" 이고 최대 값은 "+maxnum+"입니다");
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
