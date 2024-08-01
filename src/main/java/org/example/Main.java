package org.example;

import org.example.entities.MyComparator;
import org.example.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(Product.builder().name("Tv").price(900.0).build());
        products.add(Product.builder().name("Notebook").price(1200.0).build());
        products.add(Product.builder().name("Tablet").price(400.0).build());

        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for (Product p: products)
            System.out.println(p);
    }
}