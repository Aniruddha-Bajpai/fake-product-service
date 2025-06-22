package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.Product;
import org.example.ecommercespring.repositories.FakeProductStore;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeProductService  {

    private final FakeProductStore fakeProductStore;

    public FakeProductService(FakeProductStore fakeProductService) {
        this.fakeProductStore = fakeProductService;
    }

    public List<Product> getProducts() throws IOException {
        return fakeProductStore.getProducts().execute().body();
    }

    public Product getProductById(Long id) throws IOException {
        return fakeProductStore.findProduct(id).execute().body();
    }

    public Product createProduct(Product product) throws IOException{
        return fakeProductStore.createProduct(product).execute().body();
    }

    public Product updateProduct(Long id, Product product) throws IOException{
        return fakeProductStore.updateProduct(id, product).execute().body();
    }

    public Product deleteProduct(Long id) throws IOException {
        return fakeProductStore.deleteProduct(id).execute().body();
    }
}
