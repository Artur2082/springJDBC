package ua.hillel.springJdbc.servlet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.hillel.springJdbc.dao.ProductService;
import ua.hillel.springJdbc.entity.Product;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/product
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody Product product) {
        productService.insert(product);
    }

    // http://localhost:8080/product/all
    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    // http://localhost:8080/product/1
    @GetMapping("/{id}")
    public List<Product> getById(@PathVariable("id") Integer id) {
        return productService.getById(id);
    }

    // http://localhost:8080/product/delete/1
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        productService.delete(id);
    }
}
