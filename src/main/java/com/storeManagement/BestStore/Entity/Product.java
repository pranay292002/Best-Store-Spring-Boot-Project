package com.storeManagement.BestStore.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;
    private String category;
    private String brand;
    private double price;
    private double stocks;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getStocks() {
        return stocks;
    }
    public void setStocks(double stocks) {
        this.stocks = stocks;
    }

    public Product(int id, String productName, String category, String brand, double price, double stocks) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.stocks = stocks;
    }

    public Product() {
    }
    
    
}
