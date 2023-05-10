package ua.hillel.springJdbc.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Integer id;
    private List<Product> productList;

    public Cart(Integer id) {
        this.id = id;
        this.productList = new ArrayList<>();
    }

    public Cart() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", productList=" + productList +
                '}' + '\n';
    }
}
