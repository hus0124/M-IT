package model;

import java.sql.SQLException;

public interface CreateDAO {
	
	int create(ProductDTO dto) throws SQLException;
}
