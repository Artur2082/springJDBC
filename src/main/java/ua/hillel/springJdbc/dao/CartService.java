package ua.hillel.springJdbc.dao;

import org.springframework.stereotype.Service;
import ua.hillel.springJdbc.entity.Cart;


@Service
public class CartService {
    private CartDao cartDao;

    public CartService(CartDao cartDao) {
        this.cartDao = cartDao;
    }

    public int insert(Cart cart) {
        return cartDao.insert(cart);
    }

    public void delete(Integer id) {
        cartDao.deleteById(id);
    }

    public Cart getById(Integer id) {
        return cartDao.getByIdProducts(id);
    }
}
