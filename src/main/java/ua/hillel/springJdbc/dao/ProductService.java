package ua.hillel.springJdbc.dao;

import org.springframework.stereotype.Service;
import ua.hillel.springJdbc.entity.Product;

import java.util.List;

@Service
public class ProductService {
    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public int insert(Product product) {
        return productDao.insert(product);
    }

    public void delete(Integer id) {
        productDao.deleteById(id);
    }

    public List<Product> getById(Integer id) {
        return productDao.getById(id);
    }
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
