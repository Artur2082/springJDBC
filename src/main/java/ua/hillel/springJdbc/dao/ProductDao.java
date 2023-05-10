package ua.hillel.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.hillel.springJdbc.dao.mappers.ProductMapper;
import ua.hillel.springJdbc.entity.Product;


import java.util.List;

@Repository
public class ProductDao {
    private final JdbcTemplate template;

    public ProductDao(JdbcTemplate template) {
        this.template = template;
    }

    public int insert(Product product) {
        return this.template.update("insert into dbtest.product (name, price) values (?, ?)",
                product.getName(), product.getPrice());
    }

    public List<Product> getById(Integer id) {
        return template.query("select * from dbtest.product where id = ?", new ProductMapper(), id);
    }

    public void deleteById(Integer id) {
        Object[] product = new Object[]{id};
        this.template.update("delete from dbtest.product where id = ?", product);
    }

    public List<Product> getAll() {
        return template.query("select * from dbtest.product ", new ProductMapper());
    }

    public JdbcTemplate getTemplate() {
        return template;
    }
}
