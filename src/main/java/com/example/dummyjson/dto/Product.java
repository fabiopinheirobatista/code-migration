package com.example.dummyjson.dto;

<<<<<<< HEAD
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Product {

    @NotNull
    @Min(0L)
    @Max(999L)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private Double price;

    // Getters and Setters
=======
public class Product {
    private Long id;
    private String name;
    private double price;
    private String description;
    private String category;
    private int stock;
>>>>>>> feature/updating-tests

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
=======
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
>>>>>>> feature/updating-tests
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

<<<<<<< HEAD
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
=======
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
>>>>>>> feature/updating-tests
    }
}
