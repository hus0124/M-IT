import javax.servlet.http.HttpServletRequest;

public class SumModel {

	public void exec(HttpServletRequest request) {
		
		int result = Integer.parseInt(request.getParameter("num")) * 10;
		request.setAttribute("sum", result);
		
	}

}
