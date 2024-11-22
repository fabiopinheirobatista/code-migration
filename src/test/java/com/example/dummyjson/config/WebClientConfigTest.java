package com.example.dummyjson.config;

import com.example.dummyjson.dto.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebClientConfigTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void shouldReturnBadRequestWhenInvalidProductIdFormatProvided() {
        webTestClient.get().uri("/api/products/invalid-id")
                .exchange()
                .expectStatus().isBadRequest();
    }

    @Test
    void shouldReturnInternalServerErrorWhenServiceExceptionOccurs() {
        webTestClient.get().uri("/api/products/1")
                .exchange()
                .expectStatus().is5xxServerError();
    }
}