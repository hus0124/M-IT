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

public class GroupStockDAOlmpl extends DAOBase implements PriorityListDAO, Action {
	
	ActionForward forward = new ActionForward();
	List<ProductDTO> groupstocklist = new ArrayList<ProductDTO>();
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		forward.setPath("groupStockList.jsp");
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
			pstmt = conn.prepareStatement("SELECT gname, sum(jnum) FROM product, groupcode "
					+ "WHERE product.gcode = groupcode.gcode GROUP BY gname");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				productDTO = new ProductDTO();
				//productDTO.setCode(rs.getString(1));
				productDTO.setPname(rs.getString(1));
				//productDTO.setCost(rs.getInt(3));
				//productDTO.setPnum(rs.getInt(4));
				productDTO.setJnum(rs.getInt(2));
				//productDTO.setSale(rs.getInt(6));
				//productDTO.setGcode(rs.getString(7));
				groupstocklist.add(productDTO);
			}
			
			System.out.println("그룹별 재고수량 DB 조회 성공");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("그룹별 재고수량 DB 조회 실패");
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		return groupstocklist;
	}

	
}
