package model;

import java.sql.SQLException;

public interface DeleteDAO {

	int delete(ProductDTO dto) throws SQLException;
}
