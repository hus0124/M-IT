package model;

import java.sql.SQLException;
import java.util.List;

public interface PriorityListDAO {

	List<ProductDTO> readList() throws SQLException;
}
