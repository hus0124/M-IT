package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionForward;
import model.CreateDAOlmpl;

@WebServlet("/createServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CreateServlet() {
        super();
        
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
    	request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
    	System.out.println(uri);
    	int lastIndex = uri.lastIndexOf("/");
    	String uriAction = uri.substring(lastIndex + 1); 
    	System.out.println("requestURI : " + uriAction);
    	ActionForward forward = null;
    	
    	if(uriAction.equals("createServlet")) {
    		try {
    			CreateDAOlmpl createDAO = new CreateDAOlmpl();
    			forward = createDAO.execute(request, response);
    			createDAO.create(createDAO.dto);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
        }
    	    	
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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
