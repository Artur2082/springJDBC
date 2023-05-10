package ua.hillel.springdata.dao.mappers;

import org.springframework.jdbc.core.RowMapper;
import ua.hillel.springdata.entity.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {
    @Override
    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Cart(rs.getInt("id"));
    }
}
