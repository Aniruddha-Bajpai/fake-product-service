package org.example.ecommercespring.services;

import org.example.ecommercespring.dto.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface FakeProductService {

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
