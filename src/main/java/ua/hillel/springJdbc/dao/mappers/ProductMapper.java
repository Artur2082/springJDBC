package ua.hillel.springJdbc.dao.mappers;


import org.springframework.jdbc.core.RowMapper;
import ua.hillel.springJdbc.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("price"));
    }
}
