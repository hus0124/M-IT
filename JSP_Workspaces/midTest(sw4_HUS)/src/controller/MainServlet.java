package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionForward;
import model.GroupStockDAOlmpl;
import model.PriorityListDAOlmpl;
import model.ProductDTO;
import model.ProfitRankDAOlmpl;

@WebServlet("*.main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String uriaction = uri.substring(lastIndex + 1);
				
		ActionForward forward = null;
		
		if(uriaction.equals("prioritylist.main")) {
			PriorityListDAOlmpl priorityDAO = new PriorityListDAOlmpl();
			List<ProductDTO> plist = new ArrayList<ProductDTO>();
			
			try {
				forward = priorityDAO.execute(request, response);
				plist = priorityDAO.readList();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(forward != null) {
		    	if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					request.setAttribute("plist", plist);
					dispatcher.forward(request, response);
				}
	    	}
		}
		
		if(uriaction.equals("profitrank.main")) {
			ProfitRankDAOlmpl profitDAO = new ProfitRankDAOlmpl();
			List<ProductDTO> ranklist = new ArrayList<ProductDTO>();
			
			try {
				forward = profitDAO.execute(request, response);
				ranklist = profitDAO.readList();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(forward != null) {
		    	if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					request.setAttribute("ranklist", ranklist);
					dispatcher.forward(request, response);
				}
	    	}
		}		
		
		if(uriaction.equals("groupstock.main")) {
			GroupStockDAOlmpl stockDAO = new GroupStockDAOlmpl();
			List<ProductDTO> stocklist = new ArrayList<ProductDTO>();
			
			try {
				forward = stockDAO.execute(request, response);
				stocklist = stockDAO.readList();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(forward != null) {
		    	if(forward.isRedirect()) {
					response.sendRedirect(forward.getPath());
				}
				else {
					RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
					request.setAttribute("stocklist", stocklist);
					dispatcher.forward(request, response);
				}
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
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
