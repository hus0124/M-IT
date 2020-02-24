package model;

import java.sql.SQLException;

public interface UpdateDAO {

	int update(ProductDTO dto) throws SQLException;
}
