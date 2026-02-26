package com.example;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("P001", "Laptop", 112.0, 10);
        Product p2 = new Product("P002", "Mouse", 25.5, 50);

        p1.setPrice(112.0);
        p2.setStock(40);

        System.out.println(p1.getName());
        System.out.println(p1.getPrice());

        System.out.println(p2.getName());
        System.out.println(p2.getStock());

        System.out.println(p1);
        System.out.println(p2);
    }
}