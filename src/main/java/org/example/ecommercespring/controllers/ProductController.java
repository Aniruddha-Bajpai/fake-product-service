package org.example.ecommercespring.controllers;


import org.example.ecommercespring.dto.Product;
import org.example.ecommercespring.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fakeapi")
public class ProductController {

    private final ProductService fakeProductService;

    public ProductController(ProductService fakeProductService) {
        this.fakeProductService = fakeProductService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() throws IOException {
        return fakeProductService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) throws IOException {
        return fakeProductService.getProductById(id);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) throws IOException {
        return fakeProductService.createProduct(product);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) throws IOException {
        return fakeProductService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public Product deleteProduct(@PathVariable Long id) throws IOException {
        return fakeProductService.deleteProduct(id);
    }
}
