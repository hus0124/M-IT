package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadOneDAOlmpl extends DAOBase implements ReadOneDAO, Action{
	
	public ProductDTO dto = new ProductDTO();
	public ProductDTO dto2 = new ProductDTO();
	ActionForward forward = new ActionForward();
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		dto.setCode(request.getParameter("productCode"));
		forward.setPath("/lookupEdit.jsp");
		forward.setRedirect(false);
		return forward;
	}
	
	@Override
	public ProductDTO readOne(ProductDTO dto) throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement("select * from product where code = ?");
			pstmt.setString(1, dto.getCode());
			rs = pstmt.executeQuery();
			System.out.println("DB 조회 성공");
			
			while(rs.next()) {
				dto2.setCode(rs.getString(1));
				dto2.setPname(rs.getString(2));
				dto2.setCost(rs.getInt(3));
				dto2.setPnum(rs.getInt(4));
				dto2.setJnum(rs.getInt(5));
				dto2.setSale(rs.getInt(6));
				dto2.setGcode(rs.getString(7));
				
			}
			
			System.out.println("조회내용 객체생성 성공");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("DB 조회 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		return null;
	}

	

}
