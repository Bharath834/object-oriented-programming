package com.java.oop;

public class Customer {
    int id;
    String name;
    int number;
    String email;
    byte age;
    String gender;
    String address;


    Customer() {
        id = 199;
        name = "iphone";
        number = 1000;
        email = "bhaarath90@gmail.com";
        age = 25;
        gender = "male";
        address = "hyderabad";
    }

    public Customer(String name, int id, int number, String email, byte age, String gender, String address) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
}







