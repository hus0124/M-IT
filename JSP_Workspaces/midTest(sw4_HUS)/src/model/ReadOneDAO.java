package model;

import java.sql.SQLException;

public interface ReadOneDAO {
	ProductDTO readOne(ProductDTO dto) throws SQLException;
}
