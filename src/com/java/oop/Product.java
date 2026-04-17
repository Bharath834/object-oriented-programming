package com.java.oop;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String catagory;

    public Product() {
        id = 999;
        name = "apple phone";
        maxRetailPrice = 20000;
        rating = 4.5f;
        reviewCount = 22;
        discountPercentage = 25;
        isAvailable = false;
        company = "apple";
        catagory = "phone";
    }

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewCount, byte discountPercentage, boolean isAvailable, String company, String catagory) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.catagory = catagory;
    }
}



