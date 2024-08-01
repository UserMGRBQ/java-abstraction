package org.example.entities;

import lombok.Builder;

import java.util.function.Function;

@Builder
public class MyPredicate implements Function<Product, String> {

    @Override
    public String apply(Product product) {

        return product.getName().toUpperCase();
    }
}
