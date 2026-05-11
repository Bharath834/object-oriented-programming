package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;


public class SetTest {
    public static void main(String[] args){
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product(111,"product1",1000,4.3f,4,true,"company1","category1"));
        productSet.add(new Product(222,"product2",2000,3.3f,4,true,"company2","category2"));
        productSet.add(new Product(333,"product3",3000,2.3f,4,true,"company3","category3"));
        productSet.add(new Product(444,"product4",4000,1.3f,4,true,"company4","category4"));
        productSet.add(new Product(555,"product5",5000,5.3f,4,true,"company5","category5"));
        productSet.add(new Product(444,"product4",4000,1.3f,4,true,"company4","category4"));
        productSet.add(new Product(555,"product5",5000,5.3f,4,true,"company5","category5"));

        System.out.println(productSet.toString());

        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
