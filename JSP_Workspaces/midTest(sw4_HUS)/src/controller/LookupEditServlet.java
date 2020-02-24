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
import model.DeleteDAOlmpl;
import model.ReadOneDAOlmpl;
import model.UpdateDAOlmpl;

@WebServlet("*.edit")
public class LookupEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LookupEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
    	ActionForward forward = null;
    	request.setCharacterEncoding("UTF-8");
    	
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String uriaction = uri.substring(lastIndex + 1);
		
    	if(uriaction.equals("searchform.edit")) {
    		ReadOneDAOlmpl readoneDAO = new ReadOneDAOlmpl();
    		try {
    			forward = readoneDAO.execute(request, response);
    			readoneDAO.readOne(readoneDAO.dto);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	
	    	if(forward != null) {
		    	if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					request.setAttribute("dto_A", readoneDAO.dto2);
					dispatcher.forward(request, response);
				}
	    	}
    	}
    	
    	if(uriaction.equals("updateform.edit")) {
    		UpdateDAOlmpl updateDAO = new UpdateDAOlmpl();
    		try {
    			forward = updateDAO.execute(request, response);
    			updateDAO.update(updateDAO.dto);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	
	    	if(forward != null) {
		    	if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					//request.setAttribute("dto_B", updateDAO.dto);
					dispatcher.forward(request, response);
				}
	    	}
    	}
    	
    	if(uriaction.equals("deleteform.edit")) {
    		DeleteDAOlmpl deleteDAO = new DeleteDAOlmpl();
    		try {
    			forward = deleteDAO.execute(request, response);
    			deleteDAO.delete(deleteDAO.dto);
    		} catch (Exception e) {
    			e.printStackTrace();
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
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
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
