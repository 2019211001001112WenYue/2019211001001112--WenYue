package com.wenyue.model;

import java.io.InputStream;

public class Product {
    private Integer productId;
    private Integer categoryId;
    private String productName;
    private String productDescription;
    private InputStream picture;
    private double price;

    public Product() {
    }

    public Product(Integer productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public Product(Integer productId, Integer categoryId, String productName, String productDescription, InputStream picture, double price) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.picture = picture;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public InputStream getPicture() {
        return picture;
    }

    public void setPicture(InputStream picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", categoryId=" + categoryId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", picture='" + picture + '\'' +
                ", price=" + price +
                '}';
    }
}
