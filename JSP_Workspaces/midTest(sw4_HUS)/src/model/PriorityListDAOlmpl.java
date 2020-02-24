package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PriorityListDAOlmpl extends DAOBase implements PriorityListDAO, Action {
	
	ActionForward forward = new ActionForward();
	List<ProductDTO> priorityList = new ArrayList<ProductDTO>();
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		forward.setPath("priorityList.jsp");
		forward.setRedirect(false);
		return forward;
	}

	@Override
	public List<ProductDTO> readList() throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = getConnection();
		ProductDTO productDTO = null;
		
		try {
			pstmt = conn.prepareStatement("SELECT pname, (pnum-jnum) FROM product " + 
					"WHERE (jnum < pnum*0.2)");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				productDTO = new ProductDTO();
				//productDTO.setCode(rs.getString(1));
				productDTO.setPname(rs.getString(1));
				productDTO.setCost(rs.getInt(2));
				//productDTO.setPnum(rs.getInt(4));
				//productDTO.setJnum(rs.getInt(5));
				//productDTO.setSale(rs.getInt(6));
				//productDTO.setGcode(rs.getString(7));
				priorityList.add(productDTO);
			}
			
			System.out.println("우선순위 리스트 DB 조회 성공");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("우선순위 리스트 조회 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		return priorityList;
	}

	
}
