package org.example.ecommercespring.repositories;

import org.example.ecommercespring.dto.Product;
import org.springframework.web.bind.annotation.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface FakeProductStore {

    @GET("/products")
    Call<List<Product>> getProducts();

    @POST("/products")
    Call<Product> createProduct(@Body Product product);

    @GET("/products/{id}")
    Call<Product> findProduct(@Path("id") Long id);

    @PUT("/products/{id}")
    Call<Product> updateProduct(@Path("id") Long id, @Body Product product);

    @DELETE("/products/{id}")
    Call<Product> deleteProduct(@Path("id") Long id);
}
