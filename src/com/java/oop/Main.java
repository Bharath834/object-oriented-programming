package com.java.oop;

public class Main {
    static void main() {
        Customer customer = new Customer();
        Product product = new Product();
        product.id = 990;
        product.name = "vivo Phone";
        product.maxRetailPrice = 54300;
        product.rating = 4.5f;
        product.reviewCount = 43;
        product.discountPercentage = 23;
        product.isAvailable = true;
        product.company = "vivo";
        product.catagory = "phone";
        System.out.println("Id : " + product.id);
        System.out.println("name : " + product.name);
        System.out.println("maxRetailPrice :" + product.maxRetailPrice);
        System.out.println("rating :" + product.rating);
        System.out.println("reviewCount :" + product.reviewCount);
        System.out.println("isAvailable :" + product.reviewCount);
        System.out.println("company :" + product.company);
        System.out.println("catagory :" + product.catagory);

        Product product1 = new Product();
        product1.id = 990;
        product1.name = "vivo Phone";
        product1.maxRetailPrice = 54300;
        product1.rating = 4.5f;
        product1.reviewCount = 43;
        product1.discountPercentage = 23;
        product1.isAvailable = true;
        product1.company = "vivo";
        product1.catagory = "phone";
        System.out.println("Id : " + product1.id);
        System.out.println("name : " + product1.name);
        System.out.println("maxRetailPrice :" + product1.maxRetailPrice);
        System.out.println("rating :" + product1.rating);
        System.out.println("reviewCount :" + product1.reviewCount);
        System.out.println("isAvailable :" + product1.reviewCount);
        System.out.println("company :" + product1.company);
        System.out.println("catagory :" + product1.catagory);


        //customer

        customer.id = 111;
        customer.name = "bharath";
        customer.number = 9012;
        customer.email = " bhaarath9014@gmail.com";
        customer.age = 24;
        customer.gender = "male";
        customer.address = "kurnool";
        System.out.println("id:" + customer.id);
        System.out.println("name: " + customer.number);
        System.out.println("email:" + customer.email);
        System.out.println("age:" + customer.age);
        System.out.println("gender:" + customer.gender);
        System.out.println("address:" + customer.address);


        Customer customer1 = new Customer();
        System.out.println("id:" + customer1.id);
        System.out.println("name: " + customer1.number);
        System.out.println("email:" + customer1.email);
        System.out.println("age:" + customer1.age);
        System.out.println("gender:" + customer1.gender);
        System.out.println("address:" + customer1.address);

        Product product2= new Product();
        System.out.println("Id : " + product2.id);
        System.out.println("name : " + product2.name);
        System.out.println("maxRetailPrice :" + product2.maxRetailPrice);
        System.out.println("rating :" + product2.rating);
        System.out.println("reviewCount :" + product2.reviewCount);
        System.out.println("isAvailable :" + product2.reviewCount);
        System.out.println("company :" + product2.company);
        System.out.println("catagory :" + product2.catagory);



    }
}
















