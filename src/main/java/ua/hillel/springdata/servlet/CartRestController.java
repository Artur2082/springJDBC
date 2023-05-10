package ua.hillel.springdata.servlet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.hillel.springdata.dao.CartService;
import ua.hillel.springdata.entity.Cart;

@RestController
@RequestMapping("/cart")
public class CartRestController {
    private final CartService cartService;

    public CartRestController(CartService cartService) {
        this.cartService = cartService;
    }

    // http://localhost:8080/cart
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody Cart cart) {
        cartService.insert(cart);
    }

    // http://localhost:8080/cart/1
    @GetMapping("/{id}")
    public Cart getById(@PathVariable("id") Integer id) {
        return cartService.getById(id);
    }

    // http://localhost:8080/cart/delete/1
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cartService.delete(id);
    }
}
