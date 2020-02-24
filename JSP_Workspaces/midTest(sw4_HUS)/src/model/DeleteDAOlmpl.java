package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteDAOlmpl extends DAOBase implements DeleteDAO, Action {
	
	public ProductDTO dto = new ProductDTO();
	ActionForward forward = new ActionForward();
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		dto.setCode(request.getParameter("productCode"));
		forward.setPath("/sw4_HUS/mainMenu.jsp");
		return forward;
		
	}
	
	@Override
	public int delete(ProductDTO dto) throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		
		try {
			pstmt = conn.prepareStatement("delete from product where code = ?");
			pstmt.setString(1, dto.getCode());
			pstmt.executeUpdate();
			System.out.println("DB 삭제 쿼리 실행 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB 삭제 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		return 0;
	}

	

}
