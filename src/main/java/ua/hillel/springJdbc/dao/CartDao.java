package ua.hillel.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.hillel.springJdbc.dao.mappers.CartMapper;
import ua.hillel.springJdbc.dao.mappers.ProductMapper;
import ua.hillel.springJdbc.entity.Cart;


@Repository
public class CartDao {
    private final JdbcTemplate template;

    public CartDao(JdbcTemplate template) {
        this.template = template;
    }

    public int insert(Cart cart) {
        return this.template.update("insert into dbtest.cart (idcart) values (?)",
                cart.getId());
    }

    public void deleteById(Integer id) {
        Object[] cart = new Object[]{id};
        this.template.update("delete from dbtest.cart where id = ?", cart);
    }

    public Cart getById(Integer id) {
        return template.queryForObject("select * from dbtest.cart where id = ?", new CartMapper(), id);
    }

    public Cart getByIdProducts(Integer id) {
        Cart cart = getById(id);
        cart.setProductList(this.template.query(
                "select * from dbtest.product as p join dbtest.product_cart as pc on pc.idcart = ?",
                new ProductMapper(), cart.getId()));
        return cart;
    }
}
