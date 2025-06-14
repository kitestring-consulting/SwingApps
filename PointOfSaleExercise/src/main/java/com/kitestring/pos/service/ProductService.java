package com.kitestring.pos.service;

import com.kitestring.pos.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public static List<Product> getProducts() {
        return Arrays.asList(
                new Product("Espresso", 2.50),
                new Product("Latte", 3.50),
                new Product("Cappuccino", 3.25),
                new Product("Iced Coffee", 3.00),
                new Product("Bagel", 2.75),
                new Product("Croissant", 2.25),
                new Product("Muffin", 2.50),
                new Product("Scone", 2.65),
                new Product("Tea", 2.00),
                new Product("Water", 1.50),
                new Product("Juice", 2.80),
                new Product("Sandwich", 6.50)
        );
    }
}
