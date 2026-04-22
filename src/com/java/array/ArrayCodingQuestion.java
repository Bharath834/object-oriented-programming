package com.java.array;

public class ArrayCodingQuestion {
    public static int findhighestElement(int[] element){
        int highestElement = element[0];
        for (int i = 1; i < element.length; i++) {
            if(element[i]>highestElement)
                highestElement = element[i+1];
        }
        return highestElement;


    }

    static void main() {
        int[] productPrices = {57,53,89,100};
        System.out.println(findhighestElement(productPrices));

    }

}
