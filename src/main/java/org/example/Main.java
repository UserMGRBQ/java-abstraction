package org.example;

import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(Product.builder().name("Tv").price(900.0).build());
        products.add(Product.builder().name("Notebook").price(1200.0).build());
        products.add(Product.builder().name("Tablet").price(400.0).build());
        products.add(Product.builder().name("Umbrella").price(40.0).build());
        products.add(Product.builder().name("Case").price(80.0).build());

        products.forEach(p -> System.out.println(doSomething(f -> f.getName().toUpperCase(), p)));
    }

    public static String doSomething(Function<Product, String> theFunction, Product theObject) {
        if (theObject.getName().startsWith("T"))
            return theFunction.apply(theObject);
        else
            return theObject.getName() + " <- does not start with 'T'";
    }
}