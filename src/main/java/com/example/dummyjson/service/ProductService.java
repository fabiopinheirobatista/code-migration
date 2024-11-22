package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
=======
import org.springframework.web.reactive.function.client.WebClient;

>>>>>>> feature/updating-tests
import java.util.List;

@Service
public class ProductService {

    private final String BASE_URL = "https://dummyjson.com/products";

    @Autowired
<<<<<<< HEAD
    private RestTemplate restTemplate;

    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(BASE_URL, Product[].class);
        return Arrays.asList(products);
=======
    private WebClient webClient;

    public List<Product> getAllProducts() {
        return webClient.get()
                .uri(BASE_URL)
                .retrieve()
                .bodyToFlux(Product.class)
                .collectList()
                .block();
>>>>>>> feature/updating-tests
    }

    public Product getProductById(Long id) {
        String url = BASE_URL + "/" + id;
<<<<<<< HEAD
        return restTemplate.getForObject(url, Product.class);
=======
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Product.class)
                .block();
>>>>>>> feature/updating-tests
    }
}
