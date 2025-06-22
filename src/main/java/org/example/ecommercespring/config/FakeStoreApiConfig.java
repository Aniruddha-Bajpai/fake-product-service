package org.example.ecommercespring.config;

import org.example.ecommercespring.repositories.FakeProductStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class FakeStoreApiConfig {

    @Value("${BASE_URL}")
    public String FAKE_STORE_URL;

    @Bean
    public Retrofit fakeStoreRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(FAKE_STORE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeProductStore getFakeProductServiceClient() {
        return fakeStoreRetrofit().create(FakeProductStore.class);
    }

}
