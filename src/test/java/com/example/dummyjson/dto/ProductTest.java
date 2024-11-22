package com.example.dummyjson.dto;

<<<<<<< HEAD
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest {

    @Test
    public void testGetAndSetter(){
        Long expectId = 1L;
        String expectedTitle = "A dummy title";
        String expectedDescription = "A dummy description";
        Double expectedPrice = new Double("2.1");

        Product product1 = new Product();
        product1.setId(1L);
        product1.setTitle("A dummy title");
        product1.setDescription("A dummy description");
        product1.setPrice(new Double("2.1"));

        Assert.assertEquals(expectId, product1.getId());
        Assert.assertEquals(expectedTitle, product1.getTitle());
        Assert.assertEquals(expectedDescription, product1.getDescription());
        Assert.assertEquals(expectedPrice, product1.getPrice());
    }
}
=======
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
>>>>>>> feature/updating-tests
