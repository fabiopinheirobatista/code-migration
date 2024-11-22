package com.example.dummyjson.service;

import com.example.dummyjson.dto.Product;
<<<<<<< HEAD
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private RestTemplate restTemplate;

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setTitle("Product 1");

        Product product2 = new Product();
        product2.setId(2L);
        product2.setTitle("Product 2");

        Product[] products = {product1, product2};
        when(restTemplate.getForObject("https://dummyjson.com/products", Product[].class)).thenReturn(products);

        List<Product> result = productService.getAllProducts();
        assertEquals(2, result.size());
        assertEquals("Product 1", result.get(0).getTitle());
    }

    @Test
    public void testGetProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setTitle("Product 1");

        when(restTemplate.getForObject("https://dummyjson.com/products/1", Product.class)).thenReturn(product);

        Product result = productService.getProductById(1L);
        assertEquals("Product 1", result.getTitle());
    }
}
=======
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductServiceTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void shouldReturnInternalServerErrorForServiceException() {
        webTestClient.get().uri("/api/products/1")
                .exchange()
                .expectStatus().is5xxServerError();
    }

    @Test
    void shouldReturnBadRequestForInvalidProductIdFormat() {
        webTestClient.get().uri("/api/products/invalid-id")
                .exchange()
                .expectStatus().isBadRequest();
    }
}
>>>>>>> feature/updating-tests
