package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.Product;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    private final FakeProductService fakeProductService;

    public ProductService(FakeProductService fakeProductService) {
        this.fakeProductService = fakeProductService;
    }

    public List<Product> getProducts() throws IOException {
        return fakeProductService.getProducts().execute().body();
    }

    public Product getProductById(Long id) throws IOException {
        return fakeProductService.findProduct(id).execute().body();
    }

    public Product createProduct(Product product) throws IOException{
        return fakeProductService.createProduct(product).execute().body();
    }

    public Product updateProduct(Long id, Product product) throws IOException{
        return fakeProductService.updateProduct(id, product).execute().body();
    }

    public Product deleteProduct(Long id) throws IOException {
        return fakeProductService.deleteProduct(id).execute().body();
    }
}
