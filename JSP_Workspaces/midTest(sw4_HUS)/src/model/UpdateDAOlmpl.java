package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateDAOlmpl extends DAOBase implements UpdateDAO, Action {

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
		forward.setPath("/sw4_HUS/lookupEdit.jsp");
		//forward.setRedirect(false);
		return forward;
	}
	
	@Override
	public int update(ProductDTO dto) throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		int insultCount = 0;
		
		try {
			String sql="UPDATE product SET pname=?, cost=?, pnum=?, jnum=?, sale=?, gcode=? WHERE code=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPname());
			pstmt.setInt(2, dto.getCost());
			pstmt.setInt(3, dto.getPnum());
			pstmt.setInt(4, dto.getJnum());
			pstmt.setInt(5, dto.getSale());
			pstmt.setString(6, dto.getGcode());
			pstmt.setString(7, dto.getCode());
			insultCount = pstmt.executeUpdate();
			System.out.println("DB update success");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("update 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		
		return insultCount;
	}


}
