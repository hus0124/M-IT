package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateDAOlmpl extends DAOBase implements CreateDAO, Action {
		
	public ProductDTO dto = new ProductDTO();
	ActionForward forward = new ActionForward();
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		dto.setCode(request.getParameter("productCode"));
		dto.setPname(request.getParameter("productName"));
		dto.setCost(Integer.parseInt(request.getParameter("productPrice")));
		dto.setPnum(Integer.parseInt(request.getParameter("targetQuantity")));
		dto.setJnum(Integer.parseInt(request.getParameter("availableStock")));
		dto.setSale(Integer.parseInt(request.getParameter("shippingPrice")));
		dto.setGcode(request.getParameter("groupName"));
		
		System.out.println(dto.toString());
				
		forward.setPath("/sw4_HUS/mainMenu.jsp");
		//forward.setRedirect(true);
		return forward;
	}
		
	@Override
	public int create(ProductDTO dto) throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		int insultCount = 0;
		
		try {
			pstmt = conn.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			pstmt.setString(1, dto.getCode());
			pstmt.setString(2, dto.getPname());
			pstmt.setInt(3, dto.getCost());
			pstmt.setInt(4, dto.getPnum());
			pstmt.setInt(5, dto.getJnum());
			pstmt.setInt(6, dto.getSale());
			pstmt.setString(7, dto.getGcode());
			insultCount = pstmt.executeUpdate();
			System.out.println("DB create success");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("create 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		
		return insultCount;
	}

}
