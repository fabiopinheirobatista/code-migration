package com.example.dummyjson.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.dummyjson.dto.Product;

public class ProductTest {

    @Test
    void productShouldHaveCorrectId() {
        Product product = new Product();
        product.setId(1L);
        assertEquals(1L, product.getId());
    }

    @Test
    void productShouldHaveCorrectName() {
        Product product = new Product();
        product.setName("Test Product");
        assertEquals("Test Product", product.getName());
    }

    @Test
    void productShouldHaveCorrectPrice() {
        Product product = new Product();
        product.setPrice(99.99);
        assertEquals(99.99, product.getPrice());
    }

    @Test
    void productShouldHaveCorrectDescription() {
        Product product = new Product();
        product.setDescription("This is a test product.");
        assertEquals("This is a test product.", product.getDescription());
    }

    @Test
    void productShouldHaveCorrectCategory() {
        Product product = new Product();
        product.setCategory("Electronics");
        assertEquals("Electronics", product.getCategory());
    }

    @Test
    void productShouldHaveCorrectStock() {
        Product product = new Product();
        product.setStock(50);
        assertEquals(50, product.getStock());
    }
}